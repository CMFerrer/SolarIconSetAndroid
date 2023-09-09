package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.ForbiddenCircle: ImageVector
    get() {
        if (_forbiddenCircle != null) {
            return _forbiddenCircle!!
        }
        _forbiddenCircle = Builder(name = "ForbiddenCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(14.2845f, 2.75f, 16.3756f, 3.5782f, 17.9894f, 4.9507f)
                curveTo(17.9827f, 4.9569f, 17.9762f, 4.9632f, 17.9697f, 4.9697f)
                lineTo(4.9697f, 17.9694f)
                curveTo(4.9632f, 17.976f, 4.9568f, 17.9826f, 4.9506f, 17.9893f)
                curveTo(3.5781f, 16.3755f, 2.75f, 14.2845f, 2.75f, 12.0f)
                close()
                moveTo(6.0105f, 19.0492f)
                curveTo(7.6243f, 20.4218f, 9.7154f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 9.7155f, 20.4218f, 7.6244f, 19.0493f, 6.0106f)
                curveTo(19.0431f, 6.0173f, 19.0368f, 6.0239f, 19.0303f, 6.0303f)
                lineTo(6.0303f, 19.0301f)
                curveTo(6.0238f, 19.0366f, 6.0172f, 19.043f, 6.0105f, 19.0492f)
                close()
            }
        }
        .build()
        return _forbiddenCircle!!
    }

private var _forbiddenCircle: ImageVector? = null
