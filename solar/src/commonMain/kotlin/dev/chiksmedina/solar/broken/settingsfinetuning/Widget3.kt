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

val SettingsFineTuningGroup.Widget3: ImageVector
    get() {
        if (_widget3 != null) {
            return _widget3!!
        }
        _widget3 = Builder(
            name = "Widget3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5f, 6.5f)
                curveTo(21.5f, 4.2909f, 19.7091f, 2.5f, 17.5f, 2.5f)
                curveTo(15.2909f, 2.5f, 13.5f, 4.2909f, 13.5f, 6.5f)
                curveTo(13.5f, 8.7091f, 15.2909f, 10.5f, 17.5f, 10.5f)
                curveTo(19.7091f, 10.5f, 21.5f, 8.7091f, 21.5f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 17.5f)
                curveTo(10.5f, 15.2909f, 8.7091f, 13.5f, 6.5f, 13.5f)
                curveTo(4.2909f, 13.5f, 2.5f, 15.2909f, 2.5f, 17.5f)
                curveTo(2.5f, 19.7091f, 4.2909f, 21.5f, 6.5f, 21.5f)
                curveTo(8.7091f, 21.5f, 10.5f, 19.7091f, 10.5f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.6679f, 5.3496f)
                curveTo(2.5587f, 5.7139f, 2.5f, 6.1001f, 2.5f, 6.5f)
                curveTo(2.5f, 8.7091f, 4.2909f, 10.5f, 6.5f, 10.5f)
                curveTo(8.7091f, 10.5f, 10.5f, 8.7091f, 10.5f, 6.5f)
                curveTo(10.5f, 4.2909f, 8.7091f, 2.5f, 6.5f, 2.5f)
                curveTo(6.1001f, 2.5f, 5.7139f, 2.5587f, 5.3496f, 2.6679f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.8321f, 19.1504f)
                curveTo(21.9413f, 18.7861f, 22.0f, 18.3999f, 22.0f, 18.0f)
                curveTo(22.0f, 15.7909f, 20.2091f, 14.0f, 18.0f, 14.0f)
                curveTo(15.7909f, 14.0f, 14.0f, 15.7909f, 14.0f, 18.0f)
                curveTo(14.0f, 20.2091f, 15.7909f, 22.0f, 18.0f, 22.0f)
                curveTo(18.3999f, 22.0f, 18.7861f, 21.9413f, 19.1504f, 21.8321f)
            }
        }
            .build()
        return _widget3!!
    }

private var _widget3: ImageVector? = null
