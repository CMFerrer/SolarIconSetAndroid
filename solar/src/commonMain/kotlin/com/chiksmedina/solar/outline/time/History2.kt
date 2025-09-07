package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

val TimeGroup.History2: ImageVector
    get() {
        if (_history2 != null) {
            return _history2!!
        }
        _history2 = Builder(
            name = "History2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.25f, 2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                curveTo(2.4142f, 11.25f, 2.75f, 11.5858f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                curveTo(11.5858f, 2.75f, 11.25f, 2.4142f, 11.25f, 2.0f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 12.25f, 16.75f, 12.5858f, 16.75f, 13.0f)
                curveTo(16.75f, 13.4142f, 16.4142f, 13.75f, 16.0f, 13.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0996f, 2.3975f)
                curveTo(9.2487f, 2.784f, 9.0564f, 3.2181f, 8.67f, 3.3673f)
                curveTo(8.5286f, 3.4219f, 8.3888f, 3.4799f, 8.2508f, 3.5411f)
                curveTo(7.8722f, 3.7092f, 7.4291f, 3.5386f, 7.261f, 3.16f)
                curveTo(7.0929f, 2.7814f, 7.2636f, 2.3382f, 7.6422f, 2.1702f)
                curveTo(7.8027f, 2.0989f, 7.9653f, 2.0315f, 8.1298f, 1.9679f)
                curveTo(8.5162f, 1.8188f, 8.9504f, 2.0111f, 9.0996f, 2.3975f)
                close()
                moveTo(5.6477f, 4.2403f)
                curveTo(5.9334f, 4.5402f, 5.9218f, 5.0149f, 5.6218f, 5.3006f)
                curveTo(5.5122f, 5.4051f, 5.405f, 5.5122f, 5.3006f, 5.6218f)
                curveTo(5.0149f, 5.9218f, 4.5402f, 5.9334f, 4.2403f, 5.6477f)
                curveTo(3.9403f, 5.362f, 3.9287f, 4.8873f, 4.2144f, 4.5874f)
                curveTo(4.3357f, 4.46f, 4.46f, 4.3357f, 4.5874f, 4.2144f)
                curveTo(4.8873f, 3.9287f, 5.362f, 3.9403f, 5.6477f, 4.2403f)
                close()
                moveTo(3.16f, 7.261f)
                curveTo(3.5386f, 7.4291f, 3.7092f, 7.8722f, 3.5411f, 8.2508f)
                curveTo(3.4799f, 8.3888f, 3.4219f, 8.5286f, 3.3673f, 8.67f)
                curveTo(3.2181f, 9.0564f, 2.784f, 9.2487f, 2.3975f, 9.0996f)
                curveTo(2.0111f, 8.9504f, 1.8188f, 8.5162f, 1.9679f, 8.1298f)
                curveTo(2.0315f, 7.9653f, 2.0989f, 7.8027f, 2.1702f, 7.6422f)
                curveTo(2.3382f, 7.2636f, 2.7814f, 7.0929f, 3.16f, 7.261f)
                close()
            }
        }
            .build()
        return _history2!!
    }

private var _history2: ImageVector? = null
