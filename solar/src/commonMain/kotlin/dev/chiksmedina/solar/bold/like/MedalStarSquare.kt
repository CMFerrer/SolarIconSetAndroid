package dev.chiksmedina.solar.bold.like

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
import dev.chiksmedina.solar.bold.LikeGroup

val LikeGroup.MedalStarSquare: ImageVector
    get() {
        if (_medalStarSquare != null) {
            return _medalStarSquare!!
        }
        _medalStarSquare = Builder(
            name = "MedalStarSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8284f, 6.0f, 18.2426f, 6.0f, 19.1213f, 6.8787f)
                curveTo(20.0f, 7.7574f, 20.0f, 9.1716f, 20.0f, 12.0f)
                verticalLineTo(13.0557f)
                curveTo(20.0f, 15.4614f, 20.0f, 16.6642f, 19.4026f, 17.6308f)
                curveTo(18.8052f, 18.5974f, 17.7294f, 19.1353f, 15.5777f, 20.2111f)
                curveTo(13.8221f, 21.089f, 12.9443f, 21.5279f, 12.0f, 21.5279f)
                curveTo(11.0557f, 21.5279f, 10.1779f, 21.089f, 8.4223f, 20.2111f)
                curveTo(6.2706f, 19.1353f, 5.1948f, 18.5974f, 4.5974f, 17.6308f)
                curveTo(4.0f, 16.6642f, 4.0f, 15.4614f, 4.0f, 13.0557f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 9.1716f, 4.0f, 7.7574f, 4.8787f, 6.8787f)
                curveTo(5.7574f, 6.0f, 7.1716f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(11.7159f, 10.0f, 11.5259f, 10.3408f, 11.1459f, 11.0225f)
                lineTo(11.0476f, 11.1989f)
                curveTo(10.9397f, 11.3926f, 10.8857f, 11.4894f, 10.8015f, 11.5533f)
                curveTo(10.7173f, 11.6172f, 10.6125f, 11.641f, 10.4028f, 11.6884f)
                lineTo(10.2119f, 11.7316f)
                curveTo(9.474f, 11.8986f, 9.105f, 11.982f, 9.0172f, 12.2643f)
                curveTo(8.9295f, 12.5466f, 9.181f, 12.8407f, 9.684f, 13.429f)
                lineTo(9.8142f, 13.5812f)
                curveTo(9.9571f, 13.7483f, 10.0286f, 13.8319f, 10.0608f, 13.9353f)
                curveTo(10.0929f, 14.0387f, 10.0821f, 14.1502f, 10.0605f, 14.3733f)
                lineTo(10.0408f, 14.5763f)
                curveTo(9.9648f, 15.3612f, 9.9267f, 15.7536f, 10.1565f, 15.9281f)
                curveTo(10.3864f, 16.1025f, 10.7318f, 15.9435f, 11.4227f, 15.6254f)
                lineTo(11.6014f, 15.5431f)
                curveTo(11.7978f, 15.4527f, 11.8959f, 15.4075f, 12.0f, 15.4075f)
                curveTo(12.1041f, 15.4075f, 12.2022f, 15.4527f, 12.3986f, 15.5431f)
                lineTo(12.5773f, 15.6254f)
                curveTo(13.2682f, 15.9435f, 13.6136f, 16.1025f, 13.8435f, 15.9281f)
                curveTo(14.0733f, 15.7536f, 14.0352f, 15.3612f, 13.9592f, 14.5763f)
                lineTo(13.9395f, 14.3733f)
                curveTo(13.9179f, 14.1502f, 13.9071f, 14.0387f, 13.9392f, 13.9353f)
                curveTo(13.9714f, 13.8319f, 14.0429f, 13.7483f, 14.1858f, 13.5812f)
                lineTo(14.316f, 13.429f)
                curveTo(14.819f, 12.8407f, 15.0706f, 12.5466f, 14.9828f, 12.2643f)
                curveTo(14.895f, 11.982f, 14.526f, 11.8986f, 13.7881f, 11.7316f)
                lineTo(13.5972f, 11.6884f)
                curveTo(13.3875f, 11.641f, 13.2827f, 11.6172f, 13.1985f, 11.5533f)
                curveTo(13.1143f, 11.4894f, 13.0603f, 11.3926f, 12.9524f, 11.1989f)
                lineTo(12.8541f, 11.0225f)
                curveTo(12.4741f, 10.3408f, 12.2841f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0001f, 2.0f)
                horizontalLineTo(13.0001f)
                curveTo(14.8857f, 2.0f, 15.8285f, 2.0f, 16.4143f, 2.5858f)
                curveTo(16.8282f, 2.9997f, 16.9497f, 3.5918f, 16.9853f, 4.5688f)
                curveTo(16.1644f, 4.4999f, 15.1941f, 4.4999f, 14.0988f, 4.5f)
                horizontalLineTo(9.9014f)
                curveTo(8.8061f, 4.4999f, 7.8357f, 4.4999f, 7.0149f, 4.5688f)
                curveTo(7.0505f, 3.5918f, 7.172f, 2.9997f, 7.5859f, 2.5858f)
                curveTo(8.1717f, 2.0f, 9.1145f, 2.0f, 11.0001f, 2.0f)
                close()
            }
        }
            .build()
        return _medalStarSquare!!
    }

private var _medalStarSquare: ImageVector? = null
