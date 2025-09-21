package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SsdRound: ImageVector
    get() {
        if (_ssdRound != null) {
            return _ssdRound!!
        }
        _ssdRound = Builder(
            name = "SsdRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 13.5882f)
                horizontalLineTo(18.5f)
                curveTo(19.8111f, 13.5882f, 20.9538f, 14.3515f, 21.5534f, 15.4813f)
                lineTo(19.0f, 5.1177f)
                curveTo(18.5f, 3.5294f, 17.6046f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(7.5f)
                curveTo(6.3954f, 3.0f, 5.5f, 3.5294f, 5.0f, 5.1177f)
                lineTo(2.4466f, 15.4813f)
                curveTo(3.0462f, 14.3515f, 4.1889f, 13.5882f, 5.5f, 13.5882f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5f, 13.5879f)
                horizontalLineTo(5.5f)
                curveTo(4.1889f, 13.5879f, 3.0462f, 14.3512f, 2.4466f, 15.4809f)
                curveTo(2.1622f, 16.0169f, 2.0f, 16.6353f, 2.0f, 17.2938f)
                curveTo(2.0f, 19.3405f, 3.567f, 20.9997f, 5.5f, 20.9997f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 20.9997f, 22.0f, 19.3405f, 22.0f, 17.2938f)
                curveTo(22.0f, 16.6353f, 21.8378f, 16.0169f, 21.5534f, 15.4809f)
                curveTo(20.9538f, 14.3512f, 19.8111f, 13.5879f, 18.5f, 13.5879f)
                close()
                moveTo(18.0f, 16.25f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(18.75f, 18.4142f, 18.4142f, 18.75f, 18.0f, 18.75f)
                curveTo(17.5858f, 18.75f, 17.25f, 18.4142f, 17.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(17.25f, 16.5858f, 17.5858f, 16.25f, 18.0f, 16.25f)
                close()
                moveTo(16.25f, 17.0f)
                curveTo(16.25f, 16.5858f, 15.9142f, 16.25f, 15.5f, 16.25f)
                curveTo(15.0858f, 16.25f, 14.75f, 16.5858f, 14.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(14.75f, 18.4142f, 15.0858f, 18.75f, 15.5f, 18.75f)
                curveTo(15.9142f, 18.75f, 16.25f, 18.4142f, 16.25f, 18.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 16.25f)
                curveTo(13.4142f, 16.25f, 13.75f, 16.5858f, 13.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(13.75f, 18.4142f, 13.4142f, 18.75f, 13.0f, 18.75f)
                curveTo(12.5858f, 18.75f, 12.25f, 18.4142f, 12.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(12.25f, 16.5858f, 12.5858f, 16.25f, 13.0f, 16.25f)
                close()
                moveTo(11.25f, 17.0f)
                curveTo(11.25f, 16.5858f, 10.9142f, 16.25f, 10.5f, 16.25f)
                curveTo(10.0858f, 16.25f, 9.75f, 16.5858f, 9.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(9.75f, 18.4142f, 10.0858f, 18.75f, 10.5f, 18.75f)
                curveTo(10.9142f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
            .build()
        return _ssdRound!!
    }

private var _ssdRound: ImageVector? = null
