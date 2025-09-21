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

val ElectronicDevicesGroup.MonitorSmartphone: ImageVector
    get() {
        if (_monitorSmartphone != null) {
            return _monitorSmartphone!!
        }
        _monitorSmartphone = Builder(
            name = "MonitorSmartphone", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.9998f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(21.9998f, 19.8856f, 21.9998f, 20.8284f, 21.414f, 21.4142f)
                curveTo(20.8282f, 22.0f, 19.8854f, 22.0f, 17.9998f, 22.0f)
                curveTo(16.1141f, 22.0f, 15.1713f, 22.0f, 14.5855f, 21.4142f)
                curveTo(13.9998f, 20.8284f, 13.9998f, 19.8856f, 13.9998f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(13.9998f, 13.1144f, 13.9998f, 12.1716f, 14.5855f, 11.5858f)
                curveTo(15.1713f, 11.0f, 16.1141f, 11.0f, 17.9998f, 11.0f)
                curveTo(19.8854f, 11.0f, 20.8282f, 11.0f, 21.414f, 11.5858f)
                curveTo(21.9998f, 12.1716f, 21.9998f, 13.1144f, 21.9998f, 15.0f)
                close()
                moveTo(16.2498f, 20.0f)
                curveTo(16.2498f, 19.5858f, 16.5855f, 19.25f, 16.9998f, 19.25f)
                horizontalLineTo(18.9998f)
                curveTo(19.414f, 19.25f, 19.7498f, 19.5858f, 19.7498f, 20.0f)
                curveTo(19.7498f, 20.4142f, 19.414f, 20.75f, 18.9998f, 20.75f)
                horizontalLineTo(16.9998f)
                curveTo(16.5855f, 20.75f, 16.2498f, 20.4142f, 16.2498f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9997f, 17.0f)
                curveTo(5.1713f, 17.0f, 3.7571f, 17.0f, 2.8784f, 16.1213f)
                curveTo(2.3091f, 15.552f, 2.0706f, 14.7579f, 2.0f, 13.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.5162f)
                verticalLineTo(13.5f)
                curveTo(12.4996f, 13.9365f, 12.4997f, 14.4116f, 12.4997f, 14.9105f)
                verticalLineTo(18.0895f)
                curveTo(12.4996f, 18.9551f, 12.4995f, 19.7488f, 12.5863f, 20.3944f)
                curveTo(12.6819f, 21.1054f, 12.9068f, 21.8568f, 13.5249f, 22.4749f)
                lineTo(13.5503f, 22.5f)
                horizontalLineTo(7.9997f)
                curveTo(7.5855f, 22.5f, 7.2497f, 22.1642f, 7.2497f, 21.75f)
                curveTo(7.2497f, 21.3358f, 7.5855f, 21.0f, 7.9997f, 21.0f)
                horizontalLineTo(11.2497f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6568f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(10.1383f)
                curveTo(21.4916f, 9.8048f, 20.9315f, 9.6588f, 20.3944f, 9.5866f)
                curveTo(19.7488f, 9.4998f, 18.9551f, 9.4999f, 18.0895f, 9.5f)
                horizontalLineTo(17.9105f)
                curveTo(17.0448f, 9.4999f, 16.2512f, 9.4998f, 15.6056f, 9.5866f)
                curveTo(14.8946f, 9.6822f, 14.1431f, 9.9071f, 13.5251f, 10.5251f)
                curveTo(12.9376f, 11.1127f, 12.7053f, 11.8207f, 12.6017f, 12.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 12.5f)
                curveTo(1.9935f, 12.0494f, 2.0f, 11.5516f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1715f, 3.1716f)
                curveTo(4.3431f, 2.0f, 6.2287f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
            .build()
        return _monitorSmartphone!!
    }

private var _monitorSmartphone: ImageVector? = null
