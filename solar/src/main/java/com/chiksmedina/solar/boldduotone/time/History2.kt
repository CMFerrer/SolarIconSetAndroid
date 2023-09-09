package com.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.TimeGroup

public val TimeGroup.History2: ImageVector
    get() {
        if (_history2 != null) {
            return _history2!!
        }
        _history2 = Builder(name = "History2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0996f, 2.3976f)
                curveTo(9.2488f, 2.784f, 9.0565f, 3.2182f, 8.67f, 3.3674f)
                curveTo(8.5286f, 3.422f, 8.3888f, 3.4799f, 8.2508f, 3.5412f)
                curveTo(7.8723f, 3.7093f, 7.4291f, 3.5386f, 7.2611f, 3.16f)
                curveTo(7.093f, 2.7814f, 7.2636f, 2.3383f, 7.6422f, 2.1702f)
                curveTo(7.8027f, 2.099f, 7.9653f, 2.0315f, 8.1299f, 1.968f)
                curveTo(8.5163f, 1.8188f, 8.9505f, 2.0112f, 9.0996f, 2.3976f)
                close()
                moveTo(5.6478f, 4.2403f)
                curveTo(5.9334f, 4.5403f, 5.9218f, 5.015f, 5.6219f, 5.3007f)
                curveTo(5.5122f, 5.4051f, 5.4051f, 5.5122f, 5.3007f, 5.6219f)
                curveTo(5.015f, 5.9218f, 4.5403f, 5.9334f, 4.2403f, 5.6478f)
                curveTo(3.9404f, 5.3621f, 3.9288f, 4.8874f, 4.2144f, 4.5874f)
                curveTo(4.3357f, 4.4601f, 4.4601f, 4.3357f, 4.5874f, 4.2144f)
                curveTo(4.8874f, 3.9288f, 5.3621f, 3.9404f, 5.6478f, 4.2403f)
                close()
                moveTo(3.16f, 7.2611f)
                curveTo(3.5386f, 7.4291f, 3.7093f, 7.8723f, 3.5412f, 8.2508f)
                curveTo(3.4799f, 8.3888f, 3.422f, 8.5286f, 3.3674f, 8.67f)
                curveTo(3.2182f, 9.0565f, 2.784f, 9.2488f, 2.3976f, 9.0996f)
                curveTo(2.0112f, 8.9505f, 1.8188f, 8.5163f, 1.968f, 8.1299f)
                curveTo(2.0315f, 7.9653f, 2.099f, 7.8027f, 2.1702f, 7.6422f)
                curveTo(2.3383f, 7.2636f, 2.7814f, 7.093f, 3.16f, 7.2611f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        }
        .build()
        return _history2!!
    }

private var _history2: ImageVector? = null
