package dev.chiksmedina.solar.lineduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.FloorLamp: ImageVector
    get() {
        if (_floorLamp != null) {
            return _floorLamp!!
        }
        _floorLamp = Builder(
            name = "FloorLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0001f, 7.0f)
                curveTo(13.313f, 7.0f, 14.429f, 6.1565f, 14.8357f, 4.9819f)
                curveTo(15.0164f, 4.46f, 14.5523f, 4.0f, 14.0001f, 4.0f)
                horizontalLineTo(10.0001f)
                curveTo(9.4478f, 4.0f, 8.9837f, 4.46f, 9.1644f, 4.9819f)
                curveTo(9.5711f, 6.1565f, 10.6871f, 7.0f, 12.0001f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 4.0f)
                curveTo(10.0f, 2.8954f, 10.8954f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(16.9368f)
                curveTo(12.0f, 15.6554f, 11.4101f, 14.4467f, 10.4035f, 13.6655f)
                lineTo(6.5218f, 10.8909f)
                moveTo(2.7793f, 10.6844f)
                lineTo(5.3114f, 7.443f)
                moveTo(2.7793f, 10.6844f)
                curveTo(2.4297f, 11.132f, 2.5054f, 11.8018f, 3.0389f, 11.9887f)
                curveTo(4.2398f, 12.4094f, 5.6237f, 12.0438f, 6.4548f, 10.9798f)
                curveTo(6.4778f, 10.9504f, 6.5001f, 10.9208f, 6.5218f, 10.8909f)
                moveTo(2.7793f, 10.6844f)
                curveTo(1.8922f, 9.9789f, 1.7398f, 8.6814f, 2.439f, 7.7863f)
                curveTo(3.1383f, 6.8912f, 4.4243f, 6.7375f, 5.3114f, 7.443f)
                moveTo(5.3114f, 7.443f)
                curveTo(5.661f, 6.9954f, 6.3242f, 6.9132f, 6.629f, 7.393f)
                curveTo(7.296f, 8.443f, 7.287f, 9.8364f, 6.5218f, 10.8909f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(16.9368f)
                curveTo(12.0f, 15.6554f, 12.5899f, 14.4467f, 13.5965f, 13.6655f)
                lineTo(17.4782f, 10.8909f)
                moveTo(21.2207f, 10.6844f)
                lineTo(18.6886f, 7.443f)
                moveTo(21.2207f, 10.6844f)
                curveTo(21.5703f, 11.132f, 21.4946f, 11.8018f, 20.9611f, 11.9887f)
                curveTo(19.7602f, 12.4094f, 18.3763f, 12.0438f, 17.5452f, 10.9798f)
                curveTo(17.5222f, 10.9504f, 17.4999f, 10.9208f, 17.4782f, 10.8909f)
                moveTo(21.2207f, 10.6844f)
                curveTo(22.1078f, 9.9789f, 22.2602f, 8.6814f, 21.561f, 7.7863f)
                curveTo(20.8617f, 6.8912f, 19.5757f, 6.7375f, 18.6886f, 7.443f)
                moveTo(18.6886f, 7.443f)
                curveTo(18.339f, 6.9954f, 17.6758f, 6.9132f, 17.371f, 7.393f)
                curveTo(16.704f, 8.443f, 16.713f, 9.8364f, 17.4782f, 10.8909f)
            }
        }
            .build()
        return _floorLamp!!
    }

private var _floorLamp: ImageVector? = null
