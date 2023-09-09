package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.SliderMinimalisticHorizontal: ImageVector
    get() {
        if (_sliderMinimalisticHorizontal != null) {
            return _sliderMinimalisticHorizontal!!
        }
        _sliderMinimalisticHorizontal = Builder(name = "SliderMinimalisticHorizontal", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 3.0f)
                curveTo(3.75f, 2.5858f, 4.0858f, 2.25f, 4.5f, 2.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 2.25f, 20.25f, 2.5858f, 20.25f, 3.0f)
                curveTo(20.25f, 3.4142f, 19.9142f, 3.75f, 19.5f, 3.75f)
                lineTo(4.5f, 3.75f)
                curveTo(4.0858f, 3.75f, 3.75f, 3.4142f, 3.75f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.3918f, 5.3665f)
                curveTo(20.2919f, 5.4875f, 21.0497f, 5.7464f, 21.6517f, 6.3484f)
                curveTo(22.2536f, 6.9503f, 22.5125f, 7.7081f, 22.6335f, 8.6082f)
                curveTo(22.75f, 9.4752f, 22.75f, 10.5775f, 22.75f, 11.9451f)
                verticalLineTo(12.0549f)
                curveTo(22.75f, 13.4225f, 22.75f, 14.5248f, 22.6335f, 15.3918f)
                curveTo(22.5125f, 16.2919f, 22.2536f, 17.0497f, 21.6517f, 17.6516f)
                curveTo(21.0497f, 18.2536f, 20.2919f, 18.5125f, 19.3918f, 18.6335f)
                curveTo(18.5248f, 18.75f, 17.4225f, 18.75f, 16.0549f, 18.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 18.75f, 5.4752f, 18.75f, 4.6083f, 18.6335f)
                curveTo(3.7081f, 18.5125f, 2.9503f, 18.2536f, 2.3484f, 17.6516f)
                curveTo(1.7464f, 17.0497f, 1.4875f, 16.2919f, 1.3665f, 15.3918f)
                curveTo(1.25f, 14.5248f, 1.25f, 13.4225f, 1.25f, 12.0549f)
                verticalLineTo(11.9451f)
                curveTo(1.25f, 10.5775f, 1.25f, 9.4752f, 1.3665f, 8.6082f)
                curveTo(1.4875f, 7.7081f, 1.7464f, 6.9503f, 2.3484f, 6.3484f)
                curveTo(2.9503f, 5.7464f, 3.7081f, 5.4875f, 4.6083f, 5.3665f)
                curveTo(5.4752f, 5.25f, 6.5775f, 5.25f, 7.9451f, 5.25f)
                lineTo(16.0549f, 5.25f)
                curveTo(17.4225f, 5.25f, 18.5248f, 5.25f, 19.3918f, 5.3665f)
                close()
                moveTo(19.1919f, 6.8531f)
                curveTo(18.4365f, 6.7516f, 17.4354f, 6.75f, 16.0f, 6.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 6.75f, 5.5635f, 6.7516f, 4.8081f, 6.8531f)
                curveTo(4.0743f, 6.9518f, 3.6858f, 7.1322f, 3.409f, 7.409f)
                curveTo(3.1323f, 7.6858f, 2.9518f, 8.0744f, 2.8531f, 8.8081f)
                curveTo(2.7516f, 9.5635f, 2.75f, 10.5646f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4354f, 2.7516f, 14.4365f, 2.8531f, 15.1919f)
                curveTo(2.9518f, 15.9257f, 3.1323f, 16.3142f, 3.409f, 16.591f)
                curveTo(3.6858f, 16.8678f, 4.0743f, 17.0482f, 4.8081f, 17.1469f)
                curveTo(5.5635f, 17.2484f, 6.5646f, 17.25f, 8.0f, 17.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 17.25f, 18.4365f, 17.2484f, 19.1919f, 17.1469f)
                curveTo(19.9257f, 17.0482f, 20.3142f, 16.8678f, 20.591f, 16.591f)
                curveTo(20.8678f, 16.3142f, 21.0482f, 15.9257f, 21.1469f, 15.1919f)
                curveTo(21.2484f, 14.4365f, 21.25f, 13.4354f, 21.25f, 12.0f)
                curveTo(21.25f, 10.5646f, 21.2484f, 9.5635f, 21.1469f, 8.8081f)
                curveTo(21.0482f, 8.0743f, 20.8678f, 7.6858f, 20.591f, 7.409f)
                curveTo(20.3142f, 7.1322f, 19.9257f, 6.9518f, 19.1919f, 6.8531f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 21.75f)
                curveTo(4.0858f, 21.75f, 3.75f, 21.4142f, 3.75f, 21.0f)
                curveTo(3.75f, 20.5858f, 4.0858f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(19.9142f, 20.25f, 20.25f, 20.5858f, 20.25f, 21.0f)
                curveTo(20.25f, 21.4142f, 19.9142f, 21.75f, 19.5f, 21.75f)
                horizontalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _sliderMinimalisticHorizontal!!
    }

private var _sliderMinimalisticHorizontal: ImageVector? = null
