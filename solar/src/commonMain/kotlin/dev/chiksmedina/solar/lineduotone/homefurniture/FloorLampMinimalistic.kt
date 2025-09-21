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

val HomeFurnitureGroup.FloorLampMinimalistic: ImageVector
    get() {
        if (_floorLampMinimalistic != null) {
            return _floorLampMinimalistic!!
        }
        _floorLampMinimalistic = Builder(
            name = "FloorLampMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                verticalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0001f, 8.0f)
                curveTo(14.3369f, 8.0f, 16.2992f, 6.7176f, 16.8475f, 4.9845f)
                curveTo(17.0141f, 4.4579f, 16.5524f, 4.0f, 16.0001f, 4.0f)
                horizontalLineTo(8.0001f)
                curveTo(7.4478f, 4.0f, 6.9861f, 4.4579f, 7.1527f, 4.9845f)
                curveTo(7.7009f, 6.7176f, 9.6633f, 8.0f, 12.0001f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 2.8954f, 10.3431f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(17.9368f)
                curveTo(12.0f, 16.6554f, 11.4101f, 15.4467f, 10.4035f, 14.6655f)
                lineTo(6.5218f, 11.8909f)
                moveTo(2.7793f, 11.6844f)
                lineTo(5.3114f, 8.443f)
                moveTo(2.7793f, 11.6844f)
                curveTo(2.4297f, 12.132f, 2.5054f, 12.8018f, 3.0389f, 12.9887f)
                curveTo(4.2398f, 13.4094f, 5.6237f, 13.0438f, 6.4548f, 11.9798f)
                curveTo(6.4778f, 11.9505f, 6.5001f, 11.9208f, 6.5218f, 11.8909f)
                moveTo(2.7793f, 11.6844f)
                curveTo(1.8922f, 10.9789f, 1.7398f, 9.6814f, 2.439f, 8.7863f)
                curveTo(3.1383f, 7.8912f, 4.4243f, 7.7375f, 5.3114f, 8.443f)
                moveTo(5.3114f, 8.443f)
                curveTo(5.661f, 7.9954f, 6.3242f, 7.9132f, 6.629f, 8.393f)
                curveTo(7.296f, 9.443f, 7.287f, 10.8364f, 6.5218f, 11.8909f)
            }
        }
            .build()
        return _floorLampMinimalistic!!
    }

private var _floorLampMinimalistic: ImageVector? = null
