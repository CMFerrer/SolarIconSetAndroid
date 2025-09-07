package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 21.25f, 15.75f, 21.5858f, 15.75f, 22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 2.8954f, 15.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 2.8954f, 10.3431f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.4548f, 11.9798f)
                curveTo(6.4777f, 11.9505f, 6.5f, 11.9208f, 6.5217f, 11.8909f)
                curveTo(7.287f, 10.8365f, 7.296f, 9.443f, 6.6289f, 8.393f)
                curveTo(6.3241f, 7.9132f, 5.6609f, 7.9954f, 5.3113f, 8.443f)
                lineTo(2.7792f, 11.6844f)
                curveTo(2.4296f, 12.132f, 2.5054f, 12.8018f, 3.0389f, 12.9888f)
                curveTo(4.2397f, 13.4094f, 5.6236f, 13.0438f, 6.4548f, 11.9798f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0001f, 8.0f)
                curveTo(12.2549f, 8.0f, 12.5053f, 7.9848f, 12.7499f, 7.9554f)
                verticalLineTo(17.8966f)
                lineTo(12.7501f, 17.9369f)
                verticalLineTo(19.0001f)
                lineTo(12.7499f, 19.0159f)
                verticalLineTo(21.25f)
                horizontalLineTo(11.2499f)
                verticalLineTo(17.9033f)
                curveTo(11.2398f, 16.8694f, 10.7617f, 15.8984f, 9.9548f, 15.2667f)
                lineTo(6.0547f, 12.4035f)
                curveTo(6.1984f, 12.2776f, 6.3326f, 12.1363f, 6.4548f, 11.9798f)
                curveTo(6.4777f, 11.9505f, 6.5f, 11.9208f, 6.5217f, 11.8909f)
                curveTo(6.6861f, 11.6644f, 6.8155f, 11.4224f, 6.9109f, 11.1714f)
                lineTo(10.8517f, 14.064f)
                lineTo(10.8634f, 14.073f)
                curveTo(10.9987f, 14.1781f, 11.1277f, 14.2896f, 11.2499f, 14.407f)
                verticalLineTo(7.9553f)
                curveTo(11.4946f, 7.9848f, 11.7451f, 8.0f, 12.0001f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.439f, 8.7863f)
                curveTo(3.1383f, 7.8912f, 4.4243f, 7.7375f, 5.3114f, 8.443f)
                lineTo(2.7793f, 11.6844f)
                curveTo(1.8922f, 10.9789f, 1.7398f, 9.6814f, 2.439f, 8.7863f)
                close()
            }
        }
            .build()
        return _floorLampMinimalistic!!
    }

private var _floorLampMinimalistic: ImageVector? = null
