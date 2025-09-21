package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(
            name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0516f, 2.0f)
                curveTo(13.7318f, 2.0f, 15.0627f, 2.0f, 16.1043f, 2.1425f)
                curveTo(17.1762f, 2.2891f, 18.0438f, 2.598f, 18.728f, 3.2942f)
                curveTo(19.4122f, 3.9903f, 19.7159f, 4.8731f, 19.86f, 5.9637f)
                curveTo(20.0f, 7.0234f, 20.0f, 8.3775f, 20.0f, 10.087f)
                verticalLineTo(10.0871f)
                verticalLineTo(13.913f)
                verticalLineTo(13.913f)
                curveTo(20.0f, 15.6225f, 20.0f, 16.9766f, 19.86f, 18.0363f)
                curveTo(19.7159f, 19.1269f, 19.4122f, 20.0097f, 18.728f, 20.7058f)
                curveTo(18.0438f, 21.402f, 17.1762f, 21.7109f, 16.1043f, 21.8575f)
                curveTo(15.0627f, 22.0f, 13.7318f, 22.0f, 12.0517f, 22.0f)
                horizontalLineTo(12.0516f)
                horizontalLineTo(11.9484f)
                horizontalLineTo(11.9483f)
                curveTo(10.2681f, 22.0f, 8.9373f, 22.0f, 7.8958f, 21.8575f)
                curveTo(6.8238f, 21.7109f, 5.9562f, 21.402f, 5.272f, 20.7058f)
                curveTo(4.5878f, 20.0097f, 4.2841f, 19.1269f, 4.14f, 18.0363f)
                curveTo(4.0f, 16.9766f, 4.0f, 15.6225f, 4.0f, 13.913f)
                verticalLineTo(13.9129f)
                verticalLineTo(10.087f)
                verticalLineTo(10.087f)
                curveTo(4.0f, 8.3775f, 4.0f, 7.0234f, 4.14f, 5.9637f)
                curveTo(4.2841f, 4.8731f, 4.5878f, 3.9903f, 5.272f, 3.2942f)
                curveTo(5.9562f, 2.598f, 6.8238f, 2.2891f, 7.8958f, 2.1425f)
                curveTo(8.9373f, 2.0f, 10.2682f, 2.0f, 11.9484f, 2.0f)
                horizontalLineTo(11.9484f)
                horizontalLineTo(12.0516f)
                horizontalLineTo(12.0516f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5713f, 18.5112f)
                curveTo(8.5713f, 18.1258f, 8.8783f, 17.8135f, 9.257f, 17.8135f)
                horizontalLineTo(14.7427f)
                curveTo(15.1214f, 17.8135f, 15.4284f, 18.1258f, 15.4284f, 18.5112f)
                curveTo(15.4284f, 18.8965f, 15.1214f, 19.2088f, 14.7427f, 19.2088f)
                horizontalLineTo(9.257f)
                curveTo(8.8783f, 19.2088f, 8.5713f, 18.8965f, 8.5713f, 18.5112f)
                close()
            }
        }
            .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
