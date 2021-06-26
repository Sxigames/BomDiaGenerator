package net.mrgaabriel.bomdiagenerator


import mu.KotlinLogging
import net.mrgaabriel.bomdiagenerator.generator.ImageGenerator
import java.io.File
import javax.imageio.ImageIO


object BomDiaGenerator {


    lateinit var imageGenerator: ImageGenerator

    val logger = KotlinLogging.logger {}

    @JvmStatic
    fun main(args: Array<String>) {

        imageGenerator = ImageGenerator()
        val output = imageGenerator.generateImage()
        ImageIO.write(output, "png", File("bom-dia.png"))


        logger.info { "Alright! \"BomDiaGenerator\" started successfully!!!" }
    }

}