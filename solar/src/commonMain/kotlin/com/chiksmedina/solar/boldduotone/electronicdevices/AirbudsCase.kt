package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsCase: ImageVector
    get() {
        if (_airbudsCase != null) {
            return _airbudsCase!!
        }
        _airbudsCase = Builder(
            name = "AirbudsCase", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0016f, 9.75f)
                curveTo(3.0f, 10.1421f, 3.0f, 10.558f, 3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 16.7497f, 3.0f, 18.6246f, 3.9549f, 19.9389f)
                curveTo(4.2633f, 20.3634f, 4.6366f, 20.7367f, 5.0611f, 21.0451f)
                curveTo(6.3754f, 22.0f, 8.2503f, 22.0f, 12.0f, 22.0f)
                curveTo(15.7497f, 22.0f, 17.6246f, 22.0f, 18.9389f, 21.0451f)
                curveTo(19.3634f, 20.7367f, 19.7367f, 20.3634f, 20.0451f, 19.9389f)
                curveTo(21.0f, 18.6246f, 21.0f, 16.7497f, 21.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 10.558f, 21.0f, 10.1421f, 20.9984f, 9.75f)
                horizontalLineTo(17.6465f)
                curveTo(17.32f, 10.9043f, 16.2588f, 11.75f, 15.0f, 11.75f)
                horizontalLineTo(9.0f)
                curveTo(7.7412f, 11.75f, 6.68f, 10.9043f, 6.3535f, 9.75f)
                horizontalLineTo(3.0016f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0215f, 8.25f)
                horizontalLineTo(6.3537f)
                curveTo(6.6802f, 7.0957f, 7.7414f, 6.25f, 9.0002f, 6.25f)
                horizontalLineTo(15.0002f)
                curveTo(16.259f, 6.25f, 17.3202f, 7.0957f, 17.6467f, 8.25f)
                horizontalLineTo(20.9789f)
                curveTo(20.9245f, 6.2392f, 20.7314f, 5.0055f, 20.0453f, 4.0611f)
                curveTo(19.7369f, 3.6366f, 19.3636f, 3.2633f, 18.9391f, 2.9549f)
                curveTo(17.6248f, 2.0f, 15.7499f, 2.0f, 12.0002f, 2.0f)
                curveTo(8.2505f, 2.0f, 6.3756f, 2.0f, 5.0613f, 2.9549f)
                curveTo(4.6368f, 3.2633f, 4.2635f, 3.6366f, 3.9551f, 4.0611f)
                curveTo(3.269f, 5.0055f, 3.0758f, 6.2392f, 3.0215f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.75f, 9.0f)
                curveTo(7.75f, 8.3096f, 8.3096f, 7.75f, 9.0f, 7.75f)
                horizontalLineTo(15.0f)
                curveTo(15.6904f, 7.75f, 16.25f, 8.3096f, 16.25f, 9.0f)
                curveTo(16.25f, 9.6904f, 15.6904f, 10.25f, 15.0f, 10.25f)
                horizontalLineTo(9.0f)
                curveTo(8.3096f, 10.25f, 7.75f, 9.6904f, 7.75f, 9.0f)
                close()
            }
        }
            .build()
        return _airbudsCase!!
    }

private var _airbudsCase: ImageVector? = null
