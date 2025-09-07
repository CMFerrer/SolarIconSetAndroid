package com.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.HomeFurnitureGroup

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
                pathFillType = NonZero
            ) {
                moveTo(14.5987f, 3.0f)
                curveTo(14.08f, 2.4022f, 13.1104f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8896f, 2.0f, 9.9201f, 2.4022f, 9.4014f, 3.0f)
                horizontalLineTo(14.5987f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7485f, 7.9555f)
                curveTo(14.7473f, 7.7155f, 16.3589f, 6.5289f, 16.8475f, 4.9845f)
                curveTo(17.0141f, 4.4579f, 16.5524f, 4.0f, 16.0001f, 4.0f)
                horizontalLineTo(8.0001f)
                curveTo(7.4478f, 4.0f, 6.9861f, 4.4579f, 7.1527f, 4.9845f)
                curveTo(7.6412f, 6.5288f, 9.2526f, 7.7153f, 11.2511f, 7.9554f)
                curveTo(11.2503f, 7.9702f, 11.2498f, 7.985f, 11.2498f, 8.0f)
                verticalLineTo(14.407f)
                curveTo(11.1276f, 14.2895f, 10.9987f, 14.178f, 10.8634f, 14.073f)
                lineTo(10.8517f, 14.0639f)
                lineTo(6.9647f, 11.2856f)
                lineTo(6.8885f, 11.2285f)
                curveTo(7.2639f, 10.297f, 7.1636f, 9.2346f, 6.6289f, 8.393f)
                curveTo(6.3241f, 7.9132f, 5.6609f, 7.9954f, 5.3113f, 8.443f)
                lineTo(2.7792f, 11.6845f)
                curveTo(2.4296f, 12.132f, 2.5054f, 12.8018f, 3.0389f, 12.9888f)
                curveTo(4.0444f, 13.341f, 5.1781f, 13.142f, 6.0083f, 12.4433f)
                lineTo(6.0789f, 12.4962f)
                lineTo(9.9548f, 15.2666f)
                curveTo(10.7617f, 15.8983f, 11.2397f, 16.8694f, 11.2498f, 17.9033f)
                verticalLineTo(21.25f)
                horizontalLineTo(8.9998f)
                curveTo(8.5856f, 21.25f, 8.2498f, 21.5858f, 8.2498f, 22.0f)
                curveTo(8.2498f, 22.4142f, 8.5856f, 22.75f, 8.9998f, 22.75f)
                horizontalLineTo(14.9998f)
                curveTo(15.4141f, 22.75f, 15.7498f, 22.4142f, 15.7498f, 22.0f)
                curveTo(15.7498f, 21.5858f, 15.4141f, 21.25f, 14.9998f, 21.25f)
                horizontalLineTo(12.7498f)
                verticalLineTo(19.0159f)
                lineTo(12.75f, 19.0f)
                verticalLineTo(17.9368f)
                lineTo(12.7498f, 17.8966f)
                verticalLineTo(8.0f)
                curveTo(12.7498f, 7.9851f, 12.7494f, 7.9702f, 12.7485f, 7.9555f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.1568f, 10.8569f)
                lineTo(4.3685f, 8.0256f)
                curveTo(3.6606f, 7.912f, 2.9143f, 8.1779f, 2.439f, 8.7863f)
                curveTo(1.9638f, 9.3947f, 1.8819f, 10.189f, 2.1568f, 10.8569f)
                close()
            }
        }
            .build()
        return _floorLampMinimalistic!!
    }

private var _floorLampMinimalistic: ImageVector? = null
