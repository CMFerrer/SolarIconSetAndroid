package dev.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SettingsFineTuningGroup

val SettingsFineTuningGroup.Widget: ImageVector
    get() {
        if (_widget != null) {
            return _widget!!
        }
        _widget = Builder(
            name = "Widget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 6.5f)
                curveTo(13.0f, 4.3787f, 13.0f, 3.318f, 13.659f, 2.659f)
                curveTo(14.318f, 2.0f, 15.3787f, 2.0f, 17.5f, 2.0f)
                curveTo(19.6213f, 2.0f, 20.682f, 2.0f, 21.341f, 2.659f)
                curveTo(22.0f, 3.318f, 22.0f, 4.3787f, 22.0f, 6.5f)
                curveTo(22.0f, 8.6213f, 22.0f, 9.682f, 21.341f, 10.341f)
                curveTo(20.682f, 11.0f, 19.6213f, 11.0f, 17.5f, 11.0f)
                curveTo(15.3787f, 11.0f, 14.318f, 11.0f, 13.659f, 10.341f)
                curveTo(13.0f, 9.682f, 13.0f, 8.6213f, 13.0f, 6.5f)
                close()
            }
        }
            .build()
        return _widget!!
    }

private var _widget: ImageVector? = null
