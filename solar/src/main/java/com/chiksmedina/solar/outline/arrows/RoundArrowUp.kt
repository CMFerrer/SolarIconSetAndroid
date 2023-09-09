package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

public val ArrowsGroup.RoundArrowUp: ImageVector
    get() {
        if (_roundArrowUp != null) {
            return _roundArrowUp!!
        }
        _roundArrowUp = Builder(name = "RoundArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(8.4697f, 10.4697f)
                lineTo(11.4697f, 7.4697f)
                curveTo(11.7626f, 7.1768f, 12.2374f, 7.1768f, 12.5303f, 7.4697f)
                lineTo(15.5303f, 10.4697f)
                curveTo(15.8232f, 10.7626f, 15.8232f, 11.2374f, 15.5303f, 11.5303f)
                curveTo(15.2374f, 11.8232f, 14.7626f, 11.8232f, 14.4697f, 11.5303f)
                lineTo(12.75f, 9.8107f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(9.8107f)
                lineTo(9.5303f, 11.5303f)
                curveTo(9.2374f, 11.8232f, 8.7626f, 11.8232f, 8.4697f, 11.5303f)
                curveTo(8.1768f, 11.2374f, 8.1768f, 10.7626f, 8.4697f, 10.4697f)
                close()
            }
        }
        .build()
        return _roundArrowUp!!
    }

private var _roundArrowUp: ImageVector? = null
