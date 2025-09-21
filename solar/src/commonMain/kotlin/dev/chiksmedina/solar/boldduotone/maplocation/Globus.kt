package dev.chiksmedina.solar.boldduotone.maplocation

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
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.Globus: ImageVector
    get() {
        if (_globus != null) {
            return _globus!!
        }
        _globus = Builder(
            name = "Globus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.6021f, 8.2132f)
                curveTo(9.471f, 6.7542f, 8.3459f, 5.3947f, 7.7998f, 4.8974f)
                lineTo(7.4981f, 4.6393f)
                curveTo(8.715f, 3.6163f, 10.2854f, 3.0f, 11.9998f, 3.0f)
                curveTo(13.5491f, 3.0f, 14.9809f, 3.5034f, 16.1405f, 4.3555f)
                curveTo(16.3044f, 4.8529f, 15.9923f, 5.8921f, 15.6646f, 6.3895f)
                curveTo(15.5459f, 6.5696f, 15.2767f, 6.7933f, 14.9817f, 7.0053f)
                curveTo(14.3163f, 7.4833f, 13.4767f, 7.7198f, 13.0498f, 8.6f)
                curveTo(12.9277f, 8.8516f, 12.9329f, 9.0976f, 12.9916f, 9.3114f)
                curveTo(13.0338f, 9.4651f, 13.0608f, 9.6322f, 13.0612f, 9.7956f)
                curveTo(13.0626f, 10.324f, 12.5282f, 10.7058f, 11.9998f, 10.7f)
                curveTo(10.6248f, 10.685f, 9.7247f, 9.5769f, 9.6021f, 8.2132f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0057f, 14.3935f)
                curveTo(13.6974f, 13.0901f, 16.003f, 13.0901f, 16.003f, 13.0901f)
                curveTo(18.4053f, 13.065f, 18.7299f, 11.6064f, 18.9468f, 10.8691f)
                curveTo(18.5585f, 14.0061f, 16.0948f, 16.4997f, 12.9722f, 16.9335f)
                curveTo(12.7463f, 16.4582f, 12.4788f, 15.3865f, 13.0057f, 14.3935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0035f, 1.4998f)
                curveTo(18.2797f, 1.1912f, 18.7539f, 1.1649f, 19.0625f, 1.4412f)
                curveTo(21.3246f, 3.4658f, 22.75f, 6.4104f, 22.75f, 9.687f)
                curveTo(22.75f, 15.4384f, 18.3612f, 20.1647f, 12.75f, 20.6996f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 21.25f, 14.75f, 21.5858f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 22.75f, 9.25f, 22.4142f, 9.25f, 22.0f)
                curveTo(9.25f, 21.5858f, 9.5858f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.7415f)
                curveTo(8.1492f, 20.621f, 5.3754f, 19.2236f, 3.4412f, 17.0625f)
                curveTo(3.1649f, 16.7539f, 3.1912f, 16.2797f, 3.4998f, 16.0035f)
                curveTo(3.8085f, 15.7272f, 4.2826f, 15.7535f, 4.5589f, 16.0622f)
                curveTo(6.311f, 18.0198f, 8.8548f, 19.25f, 11.687f, 19.25f)
                curveTo(16.9685f, 19.25f, 21.25f, 14.9685f, 21.25f, 9.687f)
                curveTo(21.25f, 6.8548f, 20.0198f, 4.311f, 18.0622f, 2.5589f)
                curveTo(17.7535f, 2.2826f, 17.7272f, 1.8085f, 18.0035f, 1.4998f)
                close()
            }
        }
            .build()
        return _globus!!
    }

private var _globus: ImageVector? = null
