package dev.chiksmedina.solar.broken.settingsfinetuning

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
import dev.chiksmedina.solar.broken.SettingsFineTuningGroup

val SettingsFineTuningGroup.WidgetAdd: ImageVector
    get() {
        if (_widgetAdd != null) {
            return _widgetAdd!!
        }
        _widgetAdd = Builder(
            name = "WidgetAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 6.5f)
                horizontalLineTo(17.5f)
                moveTo(17.5f, 6.5f)
                horizontalLineTo(20.5f)
                moveTo(17.5f, 6.5f)
                verticalLineTo(9.5f)
                moveTo(17.5f, 6.5f)
                verticalLineTo(3.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.5508f, 15.5f)
                curveTo(2.6147f, 14.8499f, 2.7592f, 14.4124f, 3.0858f, 14.0858f)
                curveTo(3.6716f, 13.5f, 4.6144f, 13.5f, 6.5f, 13.5f)
                curveTo(8.3856f, 13.5f, 9.3285f, 13.5f, 9.9143f, 14.0858f)
                curveTo(10.5f, 14.6716f, 10.5f, 15.6144f, 10.5f, 17.5f)
                curveTo(10.5f, 19.3856f, 10.5f, 20.3284f, 9.9143f, 20.9142f)
                curveTo(9.3285f, 21.5f, 8.3856f, 21.5f, 6.5f, 21.5f)
                curveTo(4.6144f, 21.5f, 3.6716f, 21.5f, 3.0858f, 20.9142f)
                curveTo(2.7764f, 20.6048f, 2.6305f, 20.1959f, 2.5616f, 19.6011f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.5f, 6.5f)
                curveTo(2.5f, 4.6144f, 2.5f, 3.6716f, 3.0858f, 3.0858f)
                curveTo(3.6716f, 2.5f, 4.6144f, 2.5f, 6.5f, 2.5f)
                curveTo(8.3856f, 2.5f, 9.3284f, 2.5f, 9.9142f, 3.0858f)
                curveTo(10.5f, 3.6716f, 10.5f, 4.6144f, 10.5f, 6.5f)
                curveTo(10.5f, 8.3856f, 10.5f, 9.3284f, 9.9142f, 9.9142f)
                curveTo(9.3284f, 10.5f, 8.3856f, 10.5f, 6.5f, 10.5f)
                curveTo(4.6144f, 10.5f, 3.6716f, 10.5f, 3.0858f, 9.9142f)
                curveTo(2.5f, 9.3284f, 2.5f, 8.3856f, 2.5f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 15.6144f, 13.5f, 14.6716f, 14.0858f, 14.0858f)
                curveTo(14.6716f, 13.5f, 15.6144f, 13.5f, 17.5f, 13.5f)
                curveTo(19.3856f, 13.5f, 20.3284f, 13.5f, 20.9142f, 14.0858f)
                curveTo(21.5f, 14.6716f, 21.5f, 15.6144f, 21.5f, 17.5f)
                curveTo(21.5f, 19.3856f, 21.5f, 20.3284f, 20.9142f, 20.9142f)
                curveTo(20.3284f, 21.5f, 19.3856f, 21.5f, 17.5f, 21.5f)
                curveTo(15.6144f, 21.5f, 14.6716f, 21.5f, 14.0858f, 20.9142f)
                curveTo(13.5f, 20.3284f, 13.5f, 19.3856f, 13.5f, 17.5f)
                close()
            }
        }
            .build()
        return _widgetAdd!!
    }

private var _widgetAdd: ImageVector? = null
