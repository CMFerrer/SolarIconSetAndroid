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

val ArrowsGroup.RoundArrowLeftUp: ImageVector
    get() {
        if (_roundArrowLeftUp != null) {
            return _roundArrowLeftUp!!
        }
        _roundArrowLeftUp = Builder(
            name = "RoundArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 8.5858f, 8.5858f, 8.25f, 9.0f, 8.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 8.25f, 14.25f, 8.5858f, 14.25f, 9.0f)
                curveTo(14.25f, 9.4142f, 13.9142f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(10.8107f)
                lineTo(15.5303f, 14.4697f)
                curveTo(15.8232f, 14.7626f, 15.8232f, 15.2374f, 15.5303f, 15.5303f)
                curveTo(15.2374f, 15.8232f, 14.7626f, 15.8232f, 14.4697f, 15.5303f)
                lineTo(9.75f, 10.8107f)
                verticalLineTo(13.5f)
                curveTo(9.75f, 13.9142f, 9.4142f, 14.25f, 9.0f, 14.25f)
                curveTo(8.5858f, 14.25f, 8.25f, 13.9142f, 8.25f, 13.5f)
                verticalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _roundArrowLeftUp!!
    }

private var _roundArrowLeftUp: ImageVector? = null
