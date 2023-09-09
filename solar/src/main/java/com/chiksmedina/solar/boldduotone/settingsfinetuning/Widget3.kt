package com.chiksmedina.solar.boldduotone.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SettingsFineTuningGroup

public val SettingsFineTuningGroup.Widget3: ImageVector
    get() {
        if (_widget3 != null) {
            return _widget3!!
        }
        _widget3 = Builder(name = "Widget3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 6.5f)
                curveTo(22.25f, 3.8767f, 20.1234f, 1.75f, 17.5f, 1.75f)
                curveTo(14.8766f, 1.75f, 12.75f, 3.8767f, 12.75f, 6.5f)
                curveTo(12.75f, 9.1234f, 14.8766f, 11.25f, 17.5f, 11.25f)
                curveTo(20.1234f, 11.25f, 22.25f, 9.1234f, 22.25f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 17.5f)
                curveTo(11.25f, 14.8766f, 9.1234f, 12.75f, 6.5f, 12.75f)
                curveTo(3.8767f, 12.75f, 1.75f, 14.8766f, 1.75f, 17.5f)
                curveTo(1.75f, 20.1234f, 3.8767f, 22.25f, 6.5f, 22.25f)
                curveTo(9.1234f, 22.25f, 11.25f, 20.1234f, 11.25f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.75f, 6.5f)
                curveTo(1.75f, 3.8767f, 3.8767f, 1.75f, 6.5f, 1.75f)
                curveTo(9.1234f, 1.75f, 11.25f, 3.8767f, 11.25f, 6.5f)
                curveTo(11.25f, 9.1234f, 9.1234f, 11.25f, 6.5f, 11.25f)
                curveTo(3.8767f, 11.25f, 1.75f, 9.1234f, 1.75f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.75f, 17.5f)
                curveTo(12.75f, 14.8766f, 14.8766f, 12.75f, 17.5f, 12.75f)
                curveTo(20.1234f, 12.75f, 22.25f, 14.8766f, 22.25f, 17.5f)
                curveTo(22.25f, 20.1234f, 20.1234f, 22.25f, 17.5f, 22.25f)
                curveTo(14.8766f, 22.25f, 12.75f, 20.1234f, 12.75f, 17.5f)
                close()
            }
        }
        .build()
        return _widget3!!
    }

private var _widget3: ImageVector? = null
