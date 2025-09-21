package dev.chiksmedina.solar.bold.settingsfinetuning

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
import dev.chiksmedina.solar.bold.SettingsFineTuningGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.5f, 2.75f)
                curveTo(17.9142f, 2.75f, 18.25f, 3.0858f, 18.25f, 3.5f)
                verticalLineTo(5.75f)
                horizontalLineTo(20.5f)
                curveTo(20.9142f, 5.75f, 21.25f, 6.0858f, 21.25f, 6.5f)
                curveTo(21.25f, 6.9142f, 20.9142f, 7.25f, 20.5f, 7.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(9.5f)
                curveTo(18.25f, 9.9142f, 17.9142f, 10.25f, 17.5f, 10.25f)
                curveTo(17.0858f, 10.25f, 16.75f, 9.9142f, 16.75f, 9.5f)
                verticalLineTo(7.25f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 7.25f, 13.75f, 6.9142f, 13.75f, 6.5f)
                curveTo(13.75f, 6.0858f, 14.0858f, 5.75f, 14.5f, 5.75f)
                horizontalLineTo(16.75f)
                verticalLineTo(3.5f)
                curveTo(16.75f, 3.0858f, 17.0858f, 2.75f, 17.5f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 6.5f)
                curveTo(2.0f, 4.3787f, 2.0f, 3.318f, 2.659f, 2.659f)
                curveTo(3.318f, 2.0f, 4.3787f, 2.0f, 6.5f, 2.0f)
                curveTo(8.6213f, 2.0f, 9.682f, 2.0f, 10.341f, 2.659f)
                curveTo(11.0f, 3.318f, 11.0f, 4.3787f, 11.0f, 6.5f)
                curveTo(11.0f, 8.6213f, 11.0f, 9.682f, 10.341f, 10.341f)
                curveTo(9.682f, 11.0f, 8.6213f, 11.0f, 6.5f, 11.0f)
                curveTo(4.3787f, 11.0f, 3.318f, 11.0f, 2.659f, 10.341f)
                curveTo(2.0f, 9.682f, 2.0f, 8.6213f, 2.0f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.5f)
                curveTo(13.0f, 15.3787f, 13.0f, 14.318f, 13.659f, 13.659f)
                curveTo(14.318f, 13.0f, 15.3787f, 13.0f, 17.5f, 13.0f)
                curveTo(19.6213f, 13.0f, 20.682f, 13.0f, 21.341f, 13.659f)
                curveTo(22.0f, 14.318f, 22.0f, 15.3787f, 22.0f, 17.5f)
                curveTo(22.0f, 19.6213f, 22.0f, 20.682f, 21.341f, 21.341f)
                curveTo(20.682f, 22.0f, 19.6213f, 22.0f, 17.5f, 22.0f)
                curveTo(15.3787f, 22.0f, 14.318f, 22.0f, 13.659f, 21.341f)
                curveTo(13.0f, 20.682f, 13.0f, 19.6213f, 13.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 17.5f)
                curveTo(2.0f, 15.3787f, 2.0f, 14.318f, 2.659f, 13.659f)
                curveTo(3.318f, 13.0f, 4.3787f, 13.0f, 6.5f, 13.0f)
                curveTo(8.6213f, 13.0f, 9.682f, 13.0f, 10.341f, 13.659f)
                curveTo(11.0f, 14.318f, 11.0f, 15.3787f, 11.0f, 17.5f)
                curveTo(11.0f, 19.6213f, 11.0f, 20.682f, 10.341f, 21.341f)
                curveTo(9.682f, 22.0f, 8.6213f, 22.0f, 6.5f, 22.0f)
                curveTo(4.3787f, 22.0f, 3.318f, 22.0f, 2.659f, 21.341f)
                curveTo(2.0f, 20.682f, 2.0f, 19.6213f, 2.0f, 17.5f)
                close()
            }
        }
            .build()
        return _widgetAdd!!
    }

private var _widgetAdd: ImageVector? = null
