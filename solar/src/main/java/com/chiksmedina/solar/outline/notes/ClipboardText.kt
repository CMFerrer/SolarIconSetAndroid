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

public val NotesGroup.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) {
            return _clipboardText!!
        }
        _clipboardText = Builder(name = "ClipboardText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.2626f, 3.2604f)
                curveTo(7.3822f, 2.1304f, 8.3383f, 1.25f, 9.5f, 1.25f)
                horizontalLineTo(14.5f)
                curveTo(15.6617f, 1.25f, 16.6178f, 2.1304f, 16.7374f, 3.2604f)
                curveTo(17.5005f, 3.276f, 18.1603f, 3.3155f, 18.7236f, 3.419f)
                curveTo(19.4816f, 3.5582f, 20.1267f, 3.8234f, 20.6517f, 4.3484f)
                curveTo(21.2536f, 4.9503f, 21.5125f, 5.7081f, 21.6335f, 6.6083f)
                curveTo(21.75f, 7.4752f, 21.75f, 8.5775f, 21.75f, 9.9451f)
                verticalLineTo(16.0549f)
                curveTo(21.75f, 17.4225f, 21.75f, 18.5248f, 21.6335f, 19.3918f)
                curveTo(21.5125f, 20.2919f, 21.2536f, 21.0497f, 20.6517f, 21.6517f)
                curveTo(20.0497f, 22.2536f, 19.2919f, 22.5125f, 18.3918f, 22.6335f)
                curveTo(17.5248f, 22.75f, 16.4225f, 22.75f, 15.0549f, 22.75f)
                horizontalLineTo(8.9451f)
                curveTo(7.5775f, 22.75f, 6.4752f, 22.75f, 5.6083f, 22.6335f)
                curveTo(4.7081f, 22.5125f, 3.9503f, 22.2536f, 3.3484f, 21.6517f)
                curveTo(2.7464f, 21.0497f, 2.4875f, 20.2919f, 2.3665f, 19.3918f)
                curveTo(2.25f, 18.5248f, 2.25f, 17.4225f, 2.25f, 16.0549f)
                verticalLineTo(9.9451f)
                curveTo(2.25f, 8.5775f, 2.25f, 7.4752f, 2.3665f, 6.6083f)
                curveTo(2.4875f, 5.7081f, 2.7464f, 4.9503f, 3.3484f, 4.3484f)
                curveTo(3.8733f, 3.8234f, 4.5184f, 3.5582f, 5.2764f, 3.419f)
                curveTo(5.8397f, 3.3155f, 6.4995f, 3.276f, 7.2626f, 3.2604f)
                close()
                moveTo(8.75f, 4.001f)
                curveTo(8.75f, 4.0016f, 8.75f, 4.0021f, 8.75f, 4.0026f)
                verticalLineTo(4.5f)
                curveTo(8.75f, 4.9142f, 9.0858f, 5.25f, 9.5f, 5.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 5.25f, 15.25f, 4.9142f, 15.25f, 4.5f)
                verticalLineTo(4.0026f)
                curveTo(15.25f, 4.0021f, 15.25f, 4.0016f, 15.25f, 4.001f)
                verticalLineTo(3.5f)
                curveTo(15.25f, 3.0858f, 14.9142f, 2.75f, 14.5f, 2.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 2.75f, 8.75f, 3.0858f, 8.75f, 3.5f)
                verticalLineTo(4.001f)
                close()
                moveTo(16.735f, 4.7609f)
                curveTo(16.6058f, 5.8806f, 15.6544f, 6.75f, 14.5f, 6.75f)
                horizontalLineTo(9.5f)
                curveTo(8.3456f, 6.75f, 7.3942f, 5.8806f, 7.265f, 4.7609f)
                curveTo(6.5468f, 4.7762f, 5.9934f, 4.8123f, 5.5473f, 4.8943f)
                curveTo(4.9805f, 4.9984f, 4.6525f, 5.1656f, 4.409f, 5.409f)
                curveTo(4.1322f, 5.6858f, 3.9518f, 6.0743f, 3.8531f, 6.8081f)
                curveTo(3.7516f, 7.5635f, 3.75f, 8.5646f, 3.75f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(3.75f, 17.4354f, 3.7516f, 18.4365f, 3.8531f, 19.1919f)
                curveTo(3.9518f, 19.9257f, 4.1322f, 20.3142f, 4.409f, 20.591f)
                curveTo(4.6858f, 20.8678f, 5.0743f, 21.0482f, 5.8081f, 21.1469f)
                curveTo(6.5635f, 21.2484f, 7.5646f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(16.4354f, 21.25f, 17.4365f, 21.2484f, 18.1919f, 21.1469f)
                curveTo(18.9257f, 21.0482f, 19.3142f, 20.8678f, 19.591f, 20.591f)
                curveTo(19.8678f, 20.3142f, 20.0482f, 19.9257f, 20.1469f, 19.1919f)
                curveTo(20.2484f, 18.4365f, 20.25f, 17.4354f, 20.25f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(20.25f, 8.5646f, 20.2484f, 7.5635f, 20.1469f, 6.8081f)
                curveTo(20.0482f, 6.0743f, 19.8678f, 5.6858f, 19.591f, 5.409f)
                curveTo(19.3475f, 5.1656f, 19.0195f, 4.9984f, 18.4527f, 4.8943f)
                curveTo(18.0066f, 4.8123f, 17.4532f, 4.7762f, 16.735f, 4.7609f)
                close()
                moveTo(6.25f, 14.5f)
                curveTo(6.25f, 14.0858f, 6.5858f, 13.75f, 7.0f, 13.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 13.75f, 15.75f, 14.0858f, 15.75f, 14.5f)
                curveTo(15.75f, 14.9142f, 15.4142f, 15.25f, 15.0f, 15.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 15.25f, 6.25f, 14.9142f, 6.25f, 14.5f)
                close()
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(12.5f)
                curveTo(12.9142f, 17.25f, 13.25f, 17.5858f, 13.25f, 18.0f)
                curveTo(13.25f, 18.4142f, 12.9142f, 18.75f, 12.5f, 18.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
            }
        }
        .build()
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
