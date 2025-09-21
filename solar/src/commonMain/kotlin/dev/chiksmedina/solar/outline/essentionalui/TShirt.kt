package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(
            name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.0877f, 1.6285f)
                curveTo(6.7467f, 1.2424f, 7.5138f, 1.1586f, 8.2252f, 1.3456f)
                lineTo(8.7153f, 1.4746f)
                curveTo(9.2932f, 1.6265f, 9.7865f, 1.997f, 10.1061f, 2.5013f)
                curveTo(11.0139f, 3.9339f, 12.9861f, 3.9339f, 13.8939f, 2.5013f)
                curveTo(14.2135f, 1.997f, 14.7068f, 1.6265f, 15.2847f, 1.4746f)
                lineTo(15.7748f, 1.3456f)
                curveTo(16.4862f, 1.1586f, 17.2533f, 1.2424f, 17.9123f, 1.6285f)
                curveTo(18.4266f, 1.9298f, 19.133f, 2.3663f, 19.6498f, 2.7806f)
                curveTo(19.8023f, 2.9028f, 19.9563f, 3.0374f, 20.1077f, 3.1773f)
                lineTo(20.1483f, 3.2148f)
                curveTo(20.5819f, 3.6154f, 20.9731f, 3.9768f, 21.2457f, 4.3298f)
                curveTo(21.5539f, 4.7289f, 21.7531f, 5.1679f, 21.75f, 5.7204f)
                curveTo(21.7467f, 6.2921f, 21.5129f, 6.7443f, 21.1816f, 7.1505f)
                curveTo(20.8803f, 7.5198f, 20.4478f, 7.9097f, 19.9541f, 8.3548f)
                lineTo(19.7286f, 8.5582f)
                curveTo(19.1866f, 9.0469f, 19.0936f, 9.1515f, 19.0419f, 9.2697f)
                curveTo(18.9881f, 9.3928f, 18.9733f, 9.5456f, 18.9733f, 10.2955f)
                lineTo(18.9733f, 18.3118f)
                curveTo(18.9734f, 18.9333f, 18.9734f, 19.4743f, 18.91f, 19.9276f)
                curveTo(18.8405f, 20.4244f, 18.6897f, 20.8675f, 18.3605f, 21.2796f)
                curveTo(17.7344f, 22.0635f, 16.9318f, 22.21f, 15.9803f, 22.3837f)
                curveTo(15.9378f, 22.3915f, 15.8949f, 22.3993f, 15.8518f, 22.4072f)
                curveTo(14.8201f, 22.597f, 13.5179f, 22.75f, 12.0f, 22.75f)
                curveTo(10.4821f, 22.75f, 9.1799f, 22.597f, 8.1482f, 22.4072f)
                curveTo(8.1051f, 22.3993f, 8.0622f, 22.3915f, 8.0197f, 22.3837f)
                curveTo(7.0682f, 22.21f, 6.2656f, 22.0635f, 5.6395f, 21.2796f)
                curveTo(5.3103f, 20.8675f, 5.1595f, 20.4244f, 5.09f, 19.9276f)
                curveTo(5.0266f, 19.4743f, 5.0266f, 18.9333f, 5.0267f, 18.3118f)
                lineTo(5.0267f, 10.2955f)
                curveTo(5.0267f, 9.5456f, 5.0119f, 9.3928f, 4.9581f, 9.2697f)
                curveTo(4.9064f, 9.1515f, 4.8134f, 9.0469f, 4.2714f, 8.5582f)
                lineTo(4.0861f, 8.3911f)
                curveTo(4.0726f, 8.379f, 4.0592f, 8.3669f, 4.0458f, 8.3548f)
                curveTo(3.5522f, 7.9097f, 3.1197f, 7.5198f, 2.8184f, 7.1505f)
                curveTo(2.4871f, 6.7443f, 2.2533f, 6.2921f, 2.25f, 5.7204f)
                curveTo(2.2469f, 5.1679f, 2.4461f, 4.7289f, 2.7543f, 4.3298f)
                curveTo(3.0269f, 3.9768f, 3.4181f, 3.6154f, 3.8517f, 3.2148f)
                curveTo(3.8652f, 3.2023f, 3.8787f, 3.1898f, 3.8923f, 3.1773f)
                curveTo(4.0437f, 3.0374f, 4.1977f, 2.9028f, 4.3502f, 2.7806f)
                curveTo(4.867f, 2.3663f, 5.5735f, 1.9298f, 6.0877f, 1.6285f)
                close()
                moveTo(7.8437f, 2.7963f)
                curveTo(7.4953f, 2.7047f, 7.1413f, 2.7497f, 6.846f, 2.9227f)
                curveTo(6.3403f, 3.219f, 5.7143f, 3.6095f, 5.2883f, 3.951f)
                curveTo(5.1695f, 4.0462f, 5.0425f, 4.1568f, 4.9103f, 4.279f)
                curveTo(4.4232f, 4.7291f, 4.1277f, 5.0054f, 3.9414f, 5.2467f)
                curveTo(3.7822f, 5.4528f, 3.7492f, 5.5749f, 3.75f, 5.7118f)
                curveTo(3.7507f, 5.8294f, 3.783f, 5.9599f, 3.9807f, 6.2023f)
                curveTo(4.2004f, 6.4716f, 4.5447f, 6.7849f, 5.0906f, 7.2771f)
                lineTo(5.2759f, 7.4442f)
                curveTo(5.3037f, 7.4693f, 5.3313f, 7.4941f, 5.3587f, 7.5187f)
                curveTo(5.7702f, 7.8885f, 6.1345f, 8.216f, 6.3325f, 8.6688f)
                curveTo(6.5284f, 9.1169f, 6.5276f, 9.6117f, 6.5268f, 10.1808f)
                curveTo(6.5267f, 10.2187f, 6.5267f, 10.2569f, 6.5267f, 10.2955f)
                verticalLineTo(18.2649f)
                curveTo(6.5267f, 18.9468f, 6.5283f, 19.3824f, 6.5755f, 19.7198f)
                curveTo(6.6183f, 20.025f, 6.6919f, 20.1937f, 6.8116f, 20.3435f)
                curveTo(7.0552f, 20.6485f, 7.2814f, 20.7226f, 8.4196f, 20.932f)
                curveTo(9.3717f, 21.1071f, 10.5828f, 21.25f, 12.0f, 21.25f)
                curveTo(13.4172f, 21.25f, 14.6283f, 21.1071f, 15.5804f, 20.932f)
                curveTo(16.7186f, 20.7226f, 16.9448f, 20.6485f, 17.1884f, 20.3435f)
                curveTo(17.3081f, 20.1937f, 17.3817f, 20.025f, 17.4245f, 19.7198f)
                curveTo(17.4717f, 19.3824f, 17.4733f, 18.9468f, 17.4733f, 18.2649f)
                verticalLineTo(10.2955f)
                curveTo(17.4733f, 10.2569f, 17.4733f, 10.2187f, 17.4732f, 10.1808f)
                curveTo(17.4724f, 9.6117f, 17.4716f, 9.1169f, 17.6675f, 8.6688f)
                curveTo(17.8655f, 8.216f, 18.2299f, 7.8885f, 18.6413f, 7.5187f)
                curveTo(18.6687f, 7.4941f, 18.6963f, 7.4692f, 18.7241f, 7.4442f)
                lineTo(18.9094f, 7.2771f)
                curveTo(19.4553f, 6.7849f, 19.7996f, 6.4716f, 20.0193f, 6.2023f)
                curveTo(20.217f, 5.9599f, 20.2493f, 5.8294f, 20.25f, 5.7118f)
                curveTo(20.2508f, 5.5749f, 20.2178f, 5.4528f, 20.0586f, 5.2467f)
                curveTo(19.8722f, 5.0054f, 19.5768f, 4.7291f, 19.0897f, 4.279f)
                curveTo(18.9575f, 4.1568f, 18.8305f, 4.0462f, 18.7117f, 3.951f)
                curveTo(18.2857f, 3.6095f, 17.6597f, 3.219f, 17.154f, 2.9227f)
                curveTo(16.8587f, 2.7497f, 16.5047f, 2.7047f, 16.1563f, 2.7963f)
                lineTo(15.6662f, 2.9252f)
                curveTo(15.4679f, 2.9774f, 15.2852f, 3.1082f, 15.161f, 3.3042f)
                curveTo(13.6641f, 5.6663f, 10.3359f, 5.6663f, 8.8391f, 3.3042f)
                curveTo(8.7148f, 3.1082f, 8.5321f, 2.9774f, 8.3338f, 2.9252f)
                lineTo(7.8437f, 2.7963f)
                close()
            }
        }
            .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
