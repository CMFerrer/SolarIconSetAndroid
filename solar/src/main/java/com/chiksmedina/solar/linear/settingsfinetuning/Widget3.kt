package com.chiksmedina.solar.linear.settingsfinetuning

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
import com.chiksmedina.solar.linear.SettingsFineTuningGroup

public val SettingsFineTuningGroup.Widget3: ImageVector
    get() {
        if (_widget3 != null) {
            return _widget3!!
        }
        _widget3 = Builder(name = "Widget3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 6.5f)
                curveTo(2.5f, 4.2909f, 4.2909f, 2.5f, 6.5f, 2.5f)
                curveTo(8.7091f, 2.5f, 10.5f, 4.2909f, 10.5f, 6.5f)
                curveTo(10.5f, 8.7091f, 8.7091f, 10.5f, 6.5f, 10.5f)
                curveTo(4.2909f, 10.5f, 2.5f, 8.7091f, 2.5f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 15.2909f, 15.2909f, 13.5f, 17.5f, 13.5f)
                curveTo(19.7091f, 13.5f, 21.5f, 15.2909f, 21.5f, 17.5f)
                curveTo(21.5f, 19.7091f, 19.7091f, 21.5f, 17.5f, 21.5f)
                curveTo(15.2909f, 21.5f, 13.5f, 19.7091f, 13.5f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 6.5f)
                curveTo(21.5f, 4.2909f, 19.7091f, 2.5f, 17.5f, 2.5f)
                curveTo(15.2909f, 2.5f, 13.5f, 4.2909f, 13.5f, 6.5f)
                curveTo(13.5f, 8.7091f, 15.2909f, 10.5f, 17.5f, 10.5f)
                curveTo(19.7091f, 10.5f, 21.5f, 8.7091f, 21.5f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 17.5f)
                curveTo(10.5f, 15.2909f, 8.7091f, 13.5f, 6.5f, 13.5f)
                curveTo(4.2909f, 13.5f, 2.5f, 15.2909f, 2.5f, 17.5f)
                curveTo(2.5f, 19.7091f, 4.2909f, 21.5f, 6.5f, 21.5f)
                curveTo(8.7091f, 21.5f, 10.5f, 19.7091f, 10.5f, 17.5f)
                close()
            }
        }
        .build()
        return _widget3!!
    }

private var _widget3: ImageVector? = null
