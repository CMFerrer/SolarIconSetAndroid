package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

public val NotesGroup.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9451f, 1.25f)
                horizontalLineTo(15.0549f)
                curveTo(16.4225f, 1.25f, 17.5248f, 1.25f, 18.3918f, 1.3665f)
                curveTo(19.2919f, 1.4875f, 20.0497f, 1.7464f, 20.6517f, 2.3484f)
                curveTo(21.2536f, 2.9503f, 21.5125f, 3.7081f, 21.6335f, 4.6083f)
                curveTo(21.75f, 5.4752f, 21.75f, 6.5775f, 21.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(21.75f, 17.4225f, 21.75f, 18.5248f, 21.6335f, 19.3918f)
                curveTo(21.5125f, 20.2919f, 21.2536f, 21.0497f, 20.6517f, 21.6517f)
                curveTo(20.0497f, 22.2536f, 19.2919f, 22.5125f, 18.3918f, 22.6335f)
                curveTo(17.5248f, 22.75f, 16.4225f, 22.75f, 15.0549f, 22.75f)
                horizontalLineTo(8.9451f)
                curveTo(8.6316f, 22.75f, 8.332f, 22.75f, 8.0461f, 22.7486f)
                curveTo(8.0308f, 22.7495f, 8.0155f, 22.75f, 8.0f, 22.75f)
                curveTo(7.9817f, 22.75f, 7.9635f, 22.7493f, 7.9455f, 22.7481f)
                curveTo(7.0281f, 22.7424f, 6.2531f, 22.7202f, 5.6083f, 22.6335f)
                curveTo(4.7081f, 22.5125f, 3.9503f, 22.2536f, 3.3484f, 21.6517f)
                curveTo(2.7464f, 21.0497f, 2.4875f, 20.2919f, 2.3665f, 19.3918f)
                curveTo(2.2704f, 18.6768f, 2.2536f, 17.8018f, 2.2506f, 16.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 16.75f, 1.25f, 16.4142f, 1.25f, 16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                horizontalLineTo(2.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(2.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 8.75f, 1.25f, 8.4142f, 1.25f, 8.0f)
                curveTo(1.25f, 7.5858f, 1.5858f, 7.25f, 2.0f, 7.25f)
                horizontalLineTo(2.2506f)
                curveTo(2.2536f, 6.1982f, 2.2704f, 5.3232f, 2.3665f, 4.6083f)
                curveTo(2.4875f, 3.7081f, 2.7464f, 2.9503f, 3.3484f, 2.3484f)
                curveTo(3.9503f, 1.7464f, 4.7081f, 1.4875f, 5.6083f, 1.3665f)
                curveTo(6.4752f, 1.25f, 7.5775f, 1.25f, 8.9451f, 1.25f)
                close()
                moveTo(3.75f, 8.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 8.75f, 4.75f, 8.4142f, 4.75f, 8.0f)
                curveTo(4.75f, 7.5858f, 4.4142f, 7.25f, 4.0f, 7.25f)
                horizontalLineTo(3.7508f)
                curveTo(3.754f, 6.2042f, 3.7703f, 5.4244f, 3.8531f, 4.8081f)
                curveTo(3.9518f, 4.0743f, 4.1322f, 3.6858f, 4.409f, 3.409f)
                curveTo(4.6858f, 3.1323f, 5.0743f, 2.9518f, 5.8081f, 2.8531f)
                curveTo(6.2098f, 2.7991f, 6.681f, 2.7734f, 7.25f, 2.7611f)
                verticalLineTo(21.2389f)
                curveTo(6.681f, 21.2266f, 6.2098f, 21.2009f, 5.8081f, 21.1469f)
                curveTo(5.0743f, 21.0482f, 4.6858f, 20.8678f, 4.409f, 20.591f)
                curveTo(4.1322f, 20.3142f, 3.9518f, 19.9257f, 3.8531f, 19.1919f)
                curveTo(3.7703f, 18.5756f, 3.754f, 17.7958f, 3.7508f, 16.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 16.75f, 4.75f, 16.4142f, 4.75f, 16.0f)
                curveTo(4.75f, 15.5858f, 4.4142f, 15.25f, 4.0f, 15.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 12.75f, 4.75f, 12.4142f, 4.75f, 12.0f)
                curveTo(4.75f, 11.5858f, 4.4142f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(8.75f)
                close()
                moveTo(8.75f, 21.25f)
                curveTo(8.8318f, 21.25f, 8.9152f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(16.4354f, 21.25f, 17.4365f, 21.2484f, 18.1919f, 21.1469f)
                curveTo(18.9257f, 21.0482f, 19.3142f, 20.8678f, 19.591f, 20.591f)
                curveTo(19.8678f, 20.3142f, 20.0482f, 19.9257f, 20.1469f, 19.1919f)
                curveTo(20.2484f, 18.4365f, 20.25f, 17.4354f, 20.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.25f, 6.5646f, 20.2484f, 5.5635f, 20.1469f, 4.8081f)
                curveTo(20.0482f, 4.0743f, 19.8678f, 3.6858f, 19.591f, 3.409f)
                curveTo(19.3142f, 3.1323f, 18.9257f, 2.9518f, 18.1919f, 2.8531f)
                curveTo(17.4365f, 2.7516f, 16.4354f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                curveTo(8.9152f, 2.75f, 8.8318f, 2.75f, 8.75f, 2.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(10.75f, 6.5f)
                curveTo(10.75f, 6.0858f, 11.0858f, 5.75f, 11.5f, 5.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 5.75f, 17.25f, 6.0858f, 17.25f, 6.5f)
                curveTo(17.25f, 6.9142f, 16.9142f, 7.25f, 16.5f, 7.25f)
                horizontalLineTo(11.5f)
                curveTo(11.0858f, 7.25f, 10.75f, 6.9142f, 10.75f, 6.5f)
                close()
                moveTo(10.75f, 10.0f)
                curveTo(10.75f, 9.5858f, 11.0858f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 9.25f, 17.25f, 9.5858f, 17.25f, 10.0f)
                curveTo(17.25f, 10.4142f, 16.9142f, 10.75f, 16.5f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(11.0858f, 10.75f, 10.75f, 10.4142f, 10.75f, 10.0f)
                close()
            }
        }
        .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
