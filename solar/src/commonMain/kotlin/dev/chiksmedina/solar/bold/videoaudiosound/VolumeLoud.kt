package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeLoud: ImageVector
    get() {
        if (_volumeLoud != null) {
            return _volumeLoud!!
        }
        _volumeLoud = Builder(
            name = "VolumeLoud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.003f, 11.7155f)
                curveTo(2.0403f, 9.8733f, 2.059f, 8.9522f, 2.6709f, 8.1636f)
                curveTo(2.7826f, 8.0197f, 2.9465f, 7.8487f, 3.0838f, 7.7327f)
                curveTo(3.8364f, 7.0974f, 4.8299f, 7.0974f, 6.8171f, 7.0974f)
                curveTo(7.527f, 7.0974f, 7.882f, 7.0974f, 8.2204f, 7.0045f)
                curveTo(8.2907f, 6.9852f, 8.3602f, 6.963f, 8.4289f, 6.9378f)
                curveTo(8.7594f, 6.8167f, 9.0557f, 6.6084f, 9.6485f, 6.1916f)
                curveTo(11.9872f, 4.5474f, 13.1565f, 3.7253f, 14.138f, 4.0824f)
                curveTo(14.3261f, 4.1509f, 14.5083f, 4.2497f, 14.671f, 4.3716f)
                curveTo(15.5194f, 5.0074f, 15.5839f, 6.4868f, 15.7128f, 9.4454f)
                curveTo(15.7606f, 10.5409f, 15.7931f, 11.4785f, 15.7931f, 12.0f)
                curveTo(15.7931f, 12.5215f, 15.7606f, 13.4591f, 15.7128f, 14.5546f)
                curveTo(15.5839f, 17.5132f, 15.5194f, 18.9926f, 14.671f, 19.6284f)
                curveTo(14.5083f, 19.7503f, 14.3261f, 19.8491f, 14.138f, 19.9176f)
                curveTo(13.1565f, 20.2747f, 11.9872f, 19.4526f, 9.6485f, 17.8084f)
                curveTo(9.0557f, 17.3916f, 8.7594f, 17.1833f, 8.4289f, 17.0622f)
                curveTo(8.3602f, 17.037f, 8.2907f, 17.0148f, 8.2204f, 16.9955f)
                curveTo(7.882f, 16.9026f, 7.527f, 16.9026f, 6.8171f, 16.9026f)
                curveTo(4.8299f, 16.9026f, 3.8364f, 16.9026f, 3.0838f, 16.2673f)
                curveTo(2.9465f, 16.1513f, 2.7826f, 15.9803f, 2.6709f, 15.8364f)
                curveTo(2.059f, 15.0478f, 2.0403f, 14.1267f, 2.003f, 12.2845f)
                curveTo(2.001f, 12.1878f, 2.0f, 12.0928f, 2.0f, 12.0f)
                curveTo(2.0f, 11.9072f, 2.001f, 11.8122f, 2.003f, 11.7155f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.4895f, 5.5522f)
                curveTo(19.7821f, 5.2922f, 20.217f, 5.3343f, 20.4608f, 5.6463f)
                lineTo(19.931f, 6.1171f)
                curveTo(20.4608f, 5.6463f, 20.4606f, 5.646f, 20.4608f, 5.6463f)
                lineTo(20.4619f, 5.6477f)
                lineTo(20.4631f, 5.6492f)
                lineTo(20.4658f, 5.6528f)
                lineTo(20.4727f, 5.6618f)
                curveTo(20.4779f, 5.6688f, 20.4844f, 5.6776f, 20.4921f, 5.6881f)
                curveTo(20.5075f, 5.7093f, 20.5275f, 5.7377f, 20.5515f, 5.7736f)
                curveTo(20.5995f, 5.8453f, 20.6635f, 5.9467f, 20.7379f, 6.0789f)
                curveTo(20.8868f, 6.3435f, 21.077f, 6.7309f, 21.2644f, 7.2504f)
                curveTo(21.6397f, 8.2911f, 22.0f, 9.8514f, 22.0f, 12.0002f)
                curveTo(22.0f, 14.1491f, 21.6397f, 15.7094f, 21.2644f, 16.7501f)
                curveTo(21.077f, 17.2695f, 20.8868f, 17.657f, 20.7379f, 17.9216f)
                curveTo(20.6635f, 18.0538f, 20.5995f, 18.1552f, 20.5515f, 18.2269f)
                curveTo(20.5275f, 18.2627f, 20.5075f, 18.2912f, 20.4921f, 18.3123f)
                curveTo(20.4844f, 18.3229f, 20.4779f, 18.3317f, 20.4727f, 18.3386f)
                lineTo(20.4658f, 18.3477f)
                lineTo(20.4631f, 18.3513f)
                lineTo(20.4619f, 18.3528f)
                curveTo(20.4616f, 18.3531f, 20.4608f, 18.3541f, 19.931f, 17.8833f)
                lineTo(20.4608f, 18.3541f)
                curveTo(20.217f, 18.6661f, 19.7821f, 18.7083f, 19.4895f, 18.4483f)
                curveTo(19.1983f, 18.1895f, 19.1578f, 17.729f, 19.3977f, 17.417f)
                curveTo(19.3983f, 17.4163f, 19.3994f, 17.4148f, 19.4009f, 17.4127f)
                curveTo(19.4058f, 17.406f, 19.4154f, 17.3925f, 19.4291f, 17.372f)
                curveTo(19.4565f, 17.3311f, 19.5003f, 17.2625f, 19.5552f, 17.1649f)
                curveTo(19.6649f, 16.9698f, 19.8195f, 16.6587f, 19.977f, 16.2221f)
                curveTo(20.2913f, 15.3508f, 20.6207f, 13.9695f, 20.6207f, 12.0002f)
                curveTo(20.6207f, 10.0309f, 20.2913f, 8.6497f, 19.977f, 7.7784f)
                curveTo(19.8195f, 7.3418f, 19.6649f, 7.0307f, 19.5552f, 6.8356f)
                curveTo(19.5003f, 6.738f, 19.4565f, 6.6693f, 19.4291f, 6.6284f)
                curveTo(19.4154f, 6.608f, 19.4058f, 6.5945f, 19.4009f, 6.5878f)
                curveTo(19.3994f, 6.5856f, 19.3983f, 6.5842f, 19.3977f, 6.5834f)
                curveTo(19.3977f, 6.5834f, 19.3977f, 6.5834f, 19.3977f, 6.5834f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.7571f, 8.4159f)
                curveTo(18.0901f, 8.2187f, 18.51f, 8.3466f, 18.6949f, 8.7017f)
                lineTo(18.0921f, 9.0588f)
                curveTo(18.6949f, 8.7017f, 18.6948f, 8.7013f, 18.6949f, 8.7017f)
                lineTo(18.6956f, 8.7029f)
                lineTo(18.6963f, 8.7043f)
                lineTo(18.6978f, 8.7073f)
                lineTo(18.7014f, 8.7143f)
                lineTo(18.7102f, 8.7323f)
                curveTo(18.7169f, 8.7461f, 18.7251f, 8.7635f, 18.7345f, 8.7846f)
                curveTo(18.7533f, 8.8268f, 18.7772f, 8.8836f, 18.8042f, 8.9557f)
                curveTo(18.8584f, 9.1f, 18.9251f, 9.3049f, 18.99f, 9.5748f)
                curveTo(19.1199f, 10.115f, 19.2415f, 10.9119f, 19.2415f, 12.0003f)
                curveTo(19.2415f, 13.0888f, 19.1199f, 13.8857f, 18.99f, 14.4259f)
                curveTo(18.9251f, 14.6958f, 18.8584f, 14.9007f, 18.8042f, 15.045f)
                curveTo(18.7772f, 15.1171f, 18.7533f, 15.1739f, 18.7345f, 15.2161f)
                curveTo(18.7251f, 15.2372f, 18.7169f, 15.2546f, 18.7102f, 15.2684f)
                lineTo(18.7014f, 15.2864f)
                lineTo(18.6978f, 15.2934f)
                lineTo(18.6963f, 15.2964f)
                lineTo(18.6956f, 15.2978f)
                curveTo(18.6954f, 15.2981f, 18.6949f, 15.299f, 18.0921f, 14.9419f)
                lineTo(18.6949f, 15.299f)
                curveTo(18.51f, 15.6541f, 18.0901f, 15.782f, 17.7571f, 15.5847f)
                curveTo(17.427f, 15.3892f, 17.3063f, 14.9474f, 17.4846f, 14.5938f)
                lineTo(17.4892f, 14.5838f)
                curveTo(17.4955f, 14.5697f, 17.5075f, 14.5415f, 17.5236f, 14.4987f)
                curveTo(17.5557f, 14.4132f, 17.6039f, 14.2688f, 17.6539f, 14.0606f)
                curveTo(17.7539f, 13.6448f, 17.8622f, 12.9709f, 17.8622f, 12.0003f)
                curveTo(17.8622f, 11.0298f, 17.7539f, 10.3559f, 17.6539f, 9.9401f)
                curveTo(17.6039f, 9.7319f, 17.5557f, 9.5875f, 17.5236f, 9.502f)
                curveTo(17.5075f, 9.4592f, 17.4955f, 9.431f, 17.4892f, 9.4169f)
                lineTo(17.4846f, 9.4069f)
                curveTo(17.3063f, 9.0533f, 17.427f, 8.6115f, 17.7571f, 8.4159f)
                close()
            }
        }
            .build()
        return _volumeLoud!!
    }

private var _volumeLoud: ImageVector? = null
