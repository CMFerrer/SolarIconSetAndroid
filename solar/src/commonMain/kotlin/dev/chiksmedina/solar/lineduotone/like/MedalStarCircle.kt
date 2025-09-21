package dev.chiksmedina.solar.lineduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.LikeGroup

val LikeGroup.MedalStarCircle: ImageVector
    get() {
        if (_medalStarCircle != null) {
            return _medalStarCircle!!
        }
        _medalStarCircle = Builder(
            name = "MedalStarCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.1144f, 17.0f, 3.1716f, 16.4142f, 2.5858f)
                curveTo(15.8284f, 2.0f, 14.8856f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 2.0f, 8.1716f, 2.0f, 7.5858f, 2.5858f)
                curveTo(7.0f, 3.1716f, 7.0f, 4.1144f, 7.0f, 6.0f)
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.1459f, 12.0225f)
                curveTo(11.5259f, 11.3408f, 11.7159f, 11.0f, 12.0f, 11.0f)
                curveTo(12.2841f, 11.0f, 12.4741f, 11.3408f, 12.8541f, 12.0225f)
                lineTo(12.9524f, 12.1989f)
                curveTo(13.0603f, 12.3926f, 13.1143f, 12.4894f, 13.1985f, 12.5533f)
                curveTo(13.2827f, 12.6172f, 13.3875f, 12.641f, 13.5972f, 12.6884f)
                lineTo(13.7881f, 12.7316f)
                curveTo(14.526f, 12.8986f, 14.895f, 12.982f, 14.9828f, 13.2643f)
                curveTo(15.0706f, 13.5466f, 14.819f, 13.8407f, 14.316f, 14.429f)
                lineTo(14.1858f, 14.5812f)
                curveTo(14.0429f, 14.7483f, 13.9714f, 14.8319f, 13.9392f, 14.9353f)
                curveTo(13.9071f, 15.0387f, 13.9179f, 15.1502f, 13.9395f, 15.3733f)
                lineTo(13.9592f, 15.5763f)
                curveTo(14.0352f, 16.3612f, 14.0733f, 16.7536f, 13.8435f, 16.9281f)
                curveTo(13.6136f, 17.1025f, 13.2682f, 16.9435f, 12.5773f, 16.6254f)
                lineTo(12.3986f, 16.5431f)
                curveTo(12.2022f, 16.4527f, 12.1041f, 16.4075f, 12.0f, 16.4075f)
                curveTo(11.8959f, 16.4075f, 11.7978f, 16.4527f, 11.6014f, 16.5431f)
                lineTo(11.4227f, 16.6254f)
                curveTo(10.7318f, 16.9435f, 10.3864f, 17.1025f, 10.1565f, 16.9281f)
                curveTo(9.9267f, 16.7536f, 9.9648f, 16.3612f, 10.0408f, 15.5763f)
                lineTo(10.0605f, 15.3733f)
                curveTo(10.0821f, 15.1502f, 10.0929f, 15.0387f, 10.0608f, 14.9353f)
                curveTo(10.0286f, 14.8319f, 9.9571f, 14.7483f, 9.8142f, 14.5812f)
                lineTo(9.684f, 14.429f)
                curveTo(9.181f, 13.8407f, 8.9295f, 13.5466f, 9.0172f, 13.2643f)
                curveTo(9.105f, 12.982f, 9.474f, 12.8986f, 10.2119f, 12.7316f)
                lineTo(10.4028f, 12.6884f)
                curveTo(10.6125f, 12.641f, 10.7173f, 12.6172f, 10.8015f, 12.5533f)
                curveTo(10.8857f, 12.4894f, 10.9397f, 12.3926f, 11.0476f, 12.1989f)
                lineTo(11.1459f, 12.0225f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 14.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
            }
        }
            .build()
        return _medalStarCircle!!
    }

private var _medalStarCircle: ImageVector? = null
