package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.HighQuality: ImageVector
    get() {
        if (_highQuality != null) {
            return _highQuality!!
        }
        _highQuality = Builder(
            name = "HighQuality", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 7.25f)
                curveTo(6.4142f, 7.25f, 6.75f, 7.5858f, 6.75f, 8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(10.0648f)
                verticalLineTo(8.0f)
                curveTo(10.0648f, 7.5858f, 10.4006f, 7.25f, 10.8148f, 7.25f)
                curveTo(11.229f, 7.25f, 11.5648f, 7.5858f, 11.5648f, 8.0f)
                verticalLineTo(15.6191f)
                curveTo(11.5648f, 16.0333f, 11.229f, 16.3691f, 10.8148f, 16.3691f)
                curveTo(10.4006f, 16.3691f, 10.0648f, 16.0333f, 10.0648f, 15.6191f)
                verticalLineTo(12.75f)
                horizontalLineTo(6.75f)
                verticalLineTo(15.6191f)
                curveTo(6.75f, 16.0333f, 6.4142f, 16.3691f, 6.0f, 16.3691f)
                curveTo(5.5858f, 16.3691f, 5.25f, 16.0333f, 5.25f, 15.6191f)
                verticalLineTo(8.0f)
                curveTo(5.25f, 7.5858f, 5.5858f, 7.25f, 6.0f, 7.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.1111f, 7.25f)
                lineTo(16.0472f, 7.25f)
                curveTo(15.6619f, 7.2499f, 15.3826f, 7.2498f, 15.1373f, 7.2884f)
                curveTo(14.1647f, 7.4415f, 13.2582f, 8.0696f, 13.0133f, 9.0437f)
                curveTo(12.9529f, 9.2842f, 12.9533f, 9.5523f, 12.9536f, 9.8361f)
                lineTo(12.9537f, 9.9048f)
                verticalLineTo(13.7143f)
                lineTo(12.9536f, 13.783f)
                curveTo(12.9533f, 14.0668f, 12.9529f, 14.3349f, 13.0133f, 14.5754f)
                curveTo(13.2582f, 15.5495f, 14.1647f, 16.1776f, 15.1373f, 16.3307f)
                curveTo(15.3826f, 16.3693f, 15.6619f, 16.3692f, 16.0472f, 16.3691f)
                lineTo(16.1111f, 16.3691f)
                lineTo(16.175f, 16.3691f)
                curveTo(16.5604f, 16.3692f, 16.8396f, 16.3693f, 17.0849f, 16.3307f)
                curveTo(17.3655f, 16.2865f, 17.6405f, 16.2028f, 17.8958f, 16.0827f)
                lineTo(18.5346f, 16.5882f)
                curveTo(18.8595f, 16.8452f, 19.3312f, 16.7902f, 19.5882f, 16.4654f)
                curveTo(19.8452f, 16.1406f, 19.7902f, 15.6689f, 19.4654f, 15.4119f)
                lineTo(19.0199f, 15.0594f)
                curveTo(19.1015f, 14.9094f, 19.1655f, 14.7478f, 19.2089f, 14.5754f)
                curveTo(19.2693f, 14.3349f, 19.269f, 14.0668f, 19.2686f, 13.783f)
                lineTo(19.2685f, 13.7143f)
                verticalLineTo(9.9048f)
                lineTo(19.2686f, 9.8361f)
                curveTo(19.269f, 9.5523f, 19.2693f, 9.2842f, 19.2089f, 9.0437f)
                curveTo(18.964f, 8.0696f, 18.0575f, 7.4415f, 17.0849f, 7.2884f)
                curveTo(16.8396f, 7.2498f, 16.5604f, 7.2499f, 16.175f, 7.25f)
                lineTo(16.1111f, 7.25f)
                close()
                moveTo(17.5394f, 13.888f)
                lineTo(17.7656f, 14.067f)
                curveTo(17.7675f, 13.9954f, 17.7685f, 13.8861f, 17.7685f, 13.7143f)
                verticalLineTo(9.9048f)
                curveTo(17.7685f, 9.506f, 17.7628f, 9.444f, 17.7541f, 9.4094f)
                curveTo(17.6951f, 9.1746f, 17.4071f, 8.8576f, 16.8517f, 8.7702f)
                curveTo(16.7383f, 8.7523f, 16.5873f, 8.75f, 16.1111f, 8.75f)
                curveTo(15.635f, 8.75f, 15.4839f, 8.7523f, 15.3705f, 8.7702f)
                curveTo(14.8151f, 8.8576f, 14.5271f, 9.1746f, 14.4681f, 9.4094f)
                curveTo(14.4594f, 9.444f, 14.4537f, 9.506f, 14.4537f, 9.9048f)
                verticalLineTo(13.7143f)
                curveTo(14.4537f, 14.1131f, 14.4594f, 14.1751f, 14.4681f, 14.2097f)
                curveTo(14.5271f, 14.4445f, 14.8151f, 14.7615f, 15.3705f, 14.8489f)
                curveTo(15.4839f, 14.8668f, 15.635f, 14.8691f, 16.1111f, 14.8691f)
                curveTo(16.2412f, 14.8691f, 16.3471f, 14.8689f, 16.4345f, 14.8683f)
                curveTo(16.2748f, 14.6077f, 16.2852f, 14.2645f, 16.4859f, 14.0109f)
                curveTo(16.7429f, 13.686f, 17.2146f, 13.631f, 17.5394f, 13.888f)
                close()
            }
        }
            .build()
        return _highQuality!!
    }

private var _highQuality: ImageVector? = null
