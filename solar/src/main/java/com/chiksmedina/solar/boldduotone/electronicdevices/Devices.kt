package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(name = "Devices", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0516f, 2.0f)
                curveTo(15.7318f, 2.0f, 17.0627f, 2.0f, 18.1043f, 2.1425f)
                curveTo(19.1762f, 2.2891f, 20.0438f, 2.598f, 20.728f, 3.2942f)
                curveTo(21.4122f, 3.9903f, 21.7159f, 4.8731f, 21.86f, 5.9637f)
                curveTo(22.0f, 7.0234f, 22.0f, 8.3775f, 22.0f, 10.087f)
                verticalLineTo(10.0871f)
                verticalLineTo(13.913f)
                verticalLineTo(13.913f)
                curveTo(22.0f, 15.6225f, 22.0f, 16.9766f, 21.86f, 18.0363f)
                curveTo(21.7159f, 19.1269f, 21.4122f, 20.0097f, 20.728f, 20.7058f)
                curveTo(20.0438f, 21.402f, 19.1762f, 21.7109f, 18.1043f, 21.8575f)
                curveTo(17.0627f, 22.0f, 15.7318f, 22.0f, 14.0517f, 22.0f)
                horizontalLineTo(14.0516f)
                horizontalLineTo(13.9484f)
                horizontalLineTo(13.9483f)
                curveTo(12.2681f, 22.0f, 10.9373f, 22.0f, 9.8958f, 21.8575f)
                curveTo(8.8238f, 21.7109f, 7.9562f, 21.402f, 7.272f, 20.7058f)
                curveTo(6.5878f, 20.0097f, 6.2841f, 19.1269f, 6.14f, 18.0363f)
                curveTo(6.0f, 16.9766f, 6.0f, 15.6225f, 6.0f, 13.913f)
                verticalLineTo(13.9129f)
                verticalLineTo(10.087f)
                verticalLineTo(10.087f)
                curveTo(6.0f, 8.3775f, 6.0f, 7.0234f, 6.14f, 5.9637f)
                curveTo(6.2841f, 4.8731f, 6.5878f, 3.9903f, 7.272f, 3.2942f)
                curveTo(7.9562f, 2.598f, 8.8238f, 2.2891f, 9.8958f, 2.1425f)
                curveTo(10.9373f, 2.0f, 12.2682f, 2.0f, 13.9484f, 2.0f)
                horizontalLineTo(13.9484f)
                horizontalLineTo(14.0516f)
                horizontalLineTo(14.0516f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.25f)
                curveTo(11.5858f, 18.25f, 11.25f, 18.5858f, 11.25f, 19.0f)
                curveTo(11.25f, 19.4142f, 11.5858f, 19.75f, 12.0f, 19.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 19.75f, 17.75f, 19.4142f, 17.75f, 19.0f)
                curveTo(17.75f, 18.5858f, 17.4142f, 18.25f, 17.0f, 18.25f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.5f)
                curveTo(2.0f, 13.0955f, 2.0f, 12.3933f, 2.3371f, 11.8889f)
                curveTo(2.483f, 11.6705f, 2.6705f, 11.483f, 2.8889f, 11.3371f)
                curveTo(3.3933f, 11.0f, 4.0955f, 11.0f, 5.5f, 11.0f)
                curveTo(6.9045f, 11.0f, 7.6067f, 11.0f, 8.1111f, 11.3371f)
                curveTo(8.3295f, 11.483f, 8.517f, 11.6705f, 8.6629f, 11.8889f)
                curveTo(9.0f, 12.3933f, 9.0f, 13.0955f, 9.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(9.0f, 19.9045f, 9.0f, 20.6067f, 8.6629f, 21.1111f)
                curveTo(8.517f, 21.3295f, 8.3295f, 21.517f, 8.1111f, 21.6629f)
                curveTo(7.6067f, 22.0f, 6.9045f, 22.0f, 5.5f, 22.0f)
                curveTo(4.0955f, 22.0f, 3.3933f, 22.0f, 2.8889f, 21.6629f)
                curveTo(2.6705f, 21.517f, 2.483f, 21.3295f, 2.3371f, 21.1111f)
                curveTo(2.0f, 20.6067f, 2.0f, 19.9045f, 2.0f, 18.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
