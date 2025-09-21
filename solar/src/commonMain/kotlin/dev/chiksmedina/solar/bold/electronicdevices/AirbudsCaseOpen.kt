package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsCaseOpen: ImageVector
    get() {
        if (_airbudsCaseOpen != null) {
            return _airbudsCaseOpen!!
        }
        _airbudsCaseOpen = Builder(
            name = "AirbudsCaseOpen", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5f, 4.625f)
                verticalLineTo(5.9414f)
                curveTo(3.5f, 7.3059f, 4.6061f, 8.412f, 5.9706f, 8.412f)
                curveTo(6.4254f, 8.412f, 6.7941f, 8.7807f, 6.7941f, 9.2355f)
                verticalLineTo(10.0f)
                lineTo(10.5f, 10.0f)
                verticalLineTo(6.375f)
                curveTo(10.5f, 3.9588f, 8.5413f, 2.0f, 6.125f, 2.0f)
                curveTo(4.6753f, 2.0f, 3.5f, 3.1753f, 3.5f, 4.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.4999f, 4.625f)
                verticalLineTo(5.9414f)
                curveTo(20.4999f, 7.3059f, 19.3938f, 8.412f, 18.0293f, 8.412f)
                curveTo(17.5745f, 8.412f, 17.2058f, 8.7807f, 17.2058f, 9.2355f)
                verticalLineTo(10.0f)
                lineTo(13.4999f, 10.0f)
                verticalLineTo(6.375f)
                curveTo(13.4999f, 3.9588f, 15.4587f, 2.0f, 17.8749f, 2.0f)
                curveTo(19.3247f, 2.0f, 20.4999f, 3.1753f, 20.4999f, 4.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.2067f, 11.3912f)
                curveTo(3.0f, 11.6605f, 3.0f, 12.0515f, 3.0f, 12.8333f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 16.7497f, 3.0f, 18.6246f, 3.9549f, 19.9389f)
                curveTo(4.2633f, 20.3634f, 4.6366f, 20.7367f, 5.0611f, 21.0451f)
                curveTo(6.3754f, 22.0f, 8.2503f, 22.0f, 12.0f, 22.0f)
                curveTo(15.7497f, 22.0f, 17.6246f, 22.0f, 18.9389f, 21.0451f)
                curveTo(19.3634f, 20.7367f, 19.7367f, 20.3634f, 20.0451f, 19.9389f)
                curveTo(21.0f, 18.6246f, 21.0f, 16.7497f, 21.0f, 13.0f)
                verticalLineTo(12.8333f)
                curveTo(21.0f, 12.0515f, 21.0f, 11.6605f, 20.7934f, 11.3912f)
                curveTo(20.7402f, 11.3219f, 20.6781f, 11.2598f, 20.6088f, 11.2066f)
                curveTo(20.3395f, 11.0f, 19.9485f, 11.0f, 19.1667f, 11.0f)
                horizontalLineTo(16.75f)
                curveTo(16.75f, 12.5188f, 15.5188f, 13.75f, 14.0f, 13.75f)
                horizontalLineTo(10.0f)
                curveTo(8.4812f, 13.75f, 7.25f, 12.5188f, 7.25f, 11.0f)
                horizontalLineTo(4.8333f)
                curveTo(4.0515f, 11.0f, 3.6606f, 11.0f, 3.3912f, 11.2066f)
                curveTo(3.3219f, 11.2598f, 3.2599f, 11.3219f, 3.2067f, 11.3912f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 11.0f)
                curveTo(8.75f, 11.6904f, 9.3096f, 12.25f, 10.0f, 12.25f)
                horizontalLineTo(14.0f)
                curveTo(14.6904f, 12.25f, 15.25f, 11.6904f, 15.25f, 11.0f)
                horizontalLineTo(8.75f)
                close()
            }
        }
            .build()
        return _airbudsCaseOpen!!
    }

private var _airbudsCaseOpen: ImageVector? = null
