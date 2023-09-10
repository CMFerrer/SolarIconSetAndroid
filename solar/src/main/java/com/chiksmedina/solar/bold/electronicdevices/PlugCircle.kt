package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.PlugCircle: ImageVector
    get() {
        if (_plugCircle != null) {
            return _plugCircle!!
        }
        _plugCircle = Builder(
            name = "PlugCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4834f, 2.0f, 12.0139f)
                curveTo(2.0f, 17.2918f, 6.0776f, 21.6161f, 11.2503f, 22.0f)
                lineTo(11.2499f, 15.9387f)
                curveTo(9.6774f, 15.5949f, 8.5f, 14.1924f, 8.5f, 12.5146f)
                verticalLineTo(12.0139f)
                curveTo(8.5f, 11.4608f, 8.9477f, 11.0125f, 9.5f, 11.0125f)
                horizontalLineTo(9.75f)
                verticalLineTo(9.0097f)
                curveTo(9.75f, 8.5949f, 10.0858f, 8.2587f, 10.5f, 8.2587f)
                curveTo(10.9142f, 8.2587f, 11.25f, 8.5949f, 11.25f, 9.0097f)
                verticalLineTo(11.0125f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0097f)
                curveTo(12.75f, 8.5949f, 13.0858f, 8.2587f, 13.5f, 8.2587f)
                curveTo(13.9142f, 8.2587f, 14.25f, 8.5949f, 14.25f, 9.0097f)
                verticalLineTo(11.0125f)
                horizontalLineTo(14.5f)
                curveTo(15.0523f, 11.0125f, 15.5f, 11.4608f, 15.5f, 12.0139f)
                verticalLineTo(12.5146f)
                curveTo(15.5f, 14.1925f, 14.3226f, 15.595f, 12.7499f, 15.9388f)
                lineTo(12.7497f, 22.0f)
                curveTo(17.9224f, 21.6161f, 22.0f, 17.2918f, 22.0f, 12.0139f)
                curveTo(22.0f, 6.4834f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
            .build()
        return _plugCircle!!
    }

private var _plugCircle: ImageVector? = null
