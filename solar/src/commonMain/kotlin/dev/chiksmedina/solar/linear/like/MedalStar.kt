package dev.chiksmedina.solar.linear.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.LikeGroup

val LikeGroup.MedalStar: ImageVector
    get() {
        if (_medalStar != null) {
            return _medalStar!!
        }
        _medalStar = Builder(
            name = "MedalStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5638f, 5.7831f)
                curveTo(11.4591f, 5.295f, 12.541f, 5.295f, 13.4362f, 5.7831f)
                lineTo(18.2304f, 8.3973f)
                curveTo(19.1944f, 8.9229f, 19.7942f, 9.9332f, 19.7942f, 11.0312f)
                verticalLineTo(15.9688f)
                curveTo(19.7942f, 17.0668f, 19.1944f, 18.0771f, 18.2304f, 18.6027f)
                lineTo(13.4362f, 21.2169f)
                curveTo(12.541f, 21.705f, 11.4591f, 21.705f, 10.5638f, 21.2169f)
                lineTo(5.7696f, 18.6027f)
                curveTo(4.8056f, 18.0771f, 4.2058f, 17.0668f, 4.2058f, 15.9688f)
                verticalLineTo(11.0312f)
                curveTo(4.2058f, 9.9332f, 4.8056f, 8.9229f, 5.7696f, 8.3973f)
                lineTo(10.5638f, 5.7831f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.1459f, 11.5225f)
                curveTo(11.5259f, 10.8408f, 11.7159f, 10.5f, 12.0f, 10.5f)
                curveTo(12.2841f, 10.5f, 12.4741f, 10.8408f, 12.8541f, 11.5225f)
                lineTo(12.9524f, 11.6989f)
                curveTo(13.0603f, 11.8926f, 13.1143f, 11.9894f, 13.1985f, 12.0533f)
                curveTo(13.2827f, 12.1172f, 13.3875f, 12.141f, 13.5972f, 12.1884f)
                lineTo(13.7881f, 12.2316f)
                curveTo(14.526f, 12.3986f, 14.895f, 12.482f, 14.9828f, 12.7643f)
                curveTo(15.0706f, 13.0466f, 14.819f, 13.3407f, 14.316f, 13.929f)
                lineTo(14.1858f, 14.0812f)
                curveTo(14.0429f, 14.2483f, 13.9714f, 14.3319f, 13.9392f, 14.4353f)
                curveTo(13.9071f, 14.5387f, 13.9179f, 14.6502f, 13.9395f, 14.8733f)
                lineTo(13.9592f, 15.0763f)
                curveTo(14.0352f, 15.8612f, 14.0733f, 16.2536f, 13.8435f, 16.4281f)
                curveTo(13.6136f, 16.6025f, 13.2682f, 16.4435f, 12.5773f, 16.1254f)
                lineTo(12.3986f, 16.0431f)
                curveTo(12.2022f, 15.9527f, 12.1041f, 15.9075f, 12.0f, 15.9075f)
                curveTo(11.8959f, 15.9075f, 11.7978f, 15.9527f, 11.6014f, 16.0431f)
                lineTo(11.4227f, 16.1254f)
                curveTo(10.7318f, 16.4435f, 10.3864f, 16.6025f, 10.1565f, 16.4281f)
                curveTo(9.9267f, 16.2536f, 9.9648f, 15.8612f, 10.0408f, 15.0763f)
                lineTo(10.0605f, 14.8733f)
                curveTo(10.0821f, 14.6502f, 10.0929f, 14.5387f, 10.0608f, 14.4353f)
                curveTo(10.0286f, 14.3319f, 9.9571f, 14.2483f, 9.8142f, 14.0812f)
                lineTo(9.684f, 13.929f)
                curveTo(9.181f, 13.3407f, 8.9295f, 13.0466f, 9.0172f, 12.7643f)
                curveTo(9.105f, 12.482f, 9.474f, 12.3986f, 10.2119f, 12.2316f)
                lineTo(10.4028f, 12.1884f)
                curveTo(10.6125f, 12.141f, 10.7173f, 12.1172f, 10.8015f, 12.0533f)
                curveTo(10.8857f, 11.9894f, 10.9397f, 11.8926f, 11.0476f, 11.6989f)
                lineTo(11.1459f, 11.5225f)
                close()
            }
        }
            .build()
        return _medalStar!!
    }

private var _medalStar: ImageVector? = null
