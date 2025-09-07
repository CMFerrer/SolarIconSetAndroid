package com.chiksmedina.solar.outline.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Structure: ImageVector
    get() {
        if (_structure != null) {
            return _structure!!
        }
        _structure = Builder(
            name = "Structure", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 8.675f)
                curveTo(2.5383f, 8.3275f, 1.25f, 6.8142f, 1.25f, 5.0f)
                curveTo(1.25f, 2.9289f, 2.9289f, 1.25f, 5.0f, 1.25f)
                curveTo(6.8142f, 1.25f, 8.3275f, 2.5383f, 8.675f, 4.25f)
                horizontalLineTo(15.325f)
                curveTo(15.6725f, 2.5383f, 17.1858f, 1.25f, 19.0f, 1.25f)
                curveTo(21.0711f, 1.25f, 22.75f, 2.9289f, 22.75f, 5.0f)
                curveTo(22.75f, 6.8142f, 21.4617f, 8.3275f, 19.75f, 8.675f)
                verticalLineTo(15.325f)
                curveTo(21.4617f, 15.6725f, 22.75f, 17.1858f, 22.75f, 19.0f)
                curveTo(22.75f, 21.0711f, 21.0711f, 22.75f, 19.0f, 22.75f)
                curveTo(17.1858f, 22.75f, 15.6725f, 21.4617f, 15.325f, 19.75f)
                horizontalLineTo(8.675f)
                curveTo(8.3275f, 21.4617f, 6.8142f, 22.75f, 5.0f, 22.75f)
                curveTo(2.9289f, 22.75f, 1.25f, 21.0711f, 1.25f, 19.0f)
                curveTo(1.25f, 17.1858f, 2.5383f, 15.6725f, 4.25f, 15.325f)
                lineTo(4.25f, 8.675f)
                close()
                moveTo(2.75f, 5.0f)
                curveTo(2.75f, 3.7574f, 3.7574f, 2.75f, 5.0f, 2.75f)
                curveTo(6.2426f, 2.75f, 7.25f, 3.7574f, 7.25f, 5.0f)
                curveTo(7.25f, 6.2426f, 6.2426f, 7.25f, 5.0f, 7.25f)
                curveTo(3.7574f, 7.25f, 2.75f, 6.2426f, 2.75f, 5.0f)
                close()
                moveTo(5.75f, 15.325f)
                lineTo(5.75f, 8.675f)
                curveTo(7.2193f, 8.3767f, 8.3767f, 7.2193f, 8.675f, 5.75f)
                horizontalLineTo(15.325f)
                curveTo(15.6233f, 7.2193f, 16.7807f, 8.3767f, 18.25f, 8.675f)
                verticalLineTo(15.325f)
                curveTo(16.7807f, 15.6233f, 15.6233f, 16.7807f, 15.325f, 18.25f)
                horizontalLineTo(8.675f)
                curveTo(8.3767f, 16.7807f, 7.2193f, 15.6233f, 5.75f, 15.325f)
                close()
                moveTo(5.0f, 16.75f)
                curveTo(3.7574f, 16.75f, 2.75f, 17.7574f, 2.75f, 19.0f)
                curveTo(2.75f, 20.2426f, 3.7574f, 21.25f, 5.0f, 21.25f)
                curveTo(6.2426f, 21.25f, 7.25f, 20.2426f, 7.25f, 19.0f)
                curveTo(7.25f, 17.7574f, 6.2426f, 16.75f, 5.0f, 16.75f)
                close()
                moveTo(21.25f, 5.0f)
                curveTo(21.25f, 6.2426f, 20.2426f, 7.25f, 19.0f, 7.25f)
                curveTo(17.7574f, 7.25f, 16.75f, 6.2426f, 16.75f, 5.0f)
                curveTo(16.75f, 3.7574f, 17.7574f, 2.75f, 19.0f, 2.75f)
                curveTo(20.2426f, 2.75f, 21.25f, 3.7574f, 21.25f, 5.0f)
                close()
                moveTo(16.75f, 19.0f)
                curveTo(16.75f, 17.7574f, 17.7574f, 16.75f, 19.0f, 16.75f)
                curveTo(20.2426f, 16.75f, 21.25f, 17.7574f, 21.25f, 19.0f)
                curveTo(21.25f, 20.2426f, 20.2426f, 21.25f, 19.0f, 21.25f)
                curveTo(17.7574f, 21.25f, 16.75f, 20.2426f, 16.75f, 19.0f)
                close()
            }
        }
            .build()
        return _structure!!
    }

private var _structure: ImageVector? = null
