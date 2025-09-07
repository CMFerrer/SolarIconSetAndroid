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

val EssentionalUiGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(
            name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.6666f, 1.25f)
                curveTo(6.4115f, 1.25f, 4.5833f, 3.0782f, 4.5833f, 5.3333f)
                curveTo(4.5833f, 6.7097f, 5.2642f, 7.9269f, 6.3076f, 8.6667f)
                curveTo(5.2642f, 9.4064f, 4.5833f, 10.6237f, 4.5833f, 12.0f)
                curveTo(4.5833f, 13.3763f, 5.2642f, 14.5936f, 6.3076f, 15.3333f)
                curveTo(5.2642f, 16.0731f, 4.5833f, 17.2903f, 4.5833f, 18.6667f)
                curveTo(4.5833f, 20.9218f, 6.4115f, 22.75f, 8.6666f, 22.75f)
                curveTo(10.9218f, 22.75f, 12.75f, 20.9218f, 12.75f, 18.6667f)
                verticalLineTo(15.1624f)
                curveTo(13.4538f, 15.738f, 14.3532f, 16.0833f, 15.3333f, 16.0833f)
                curveTo(17.5885f, 16.0833f, 19.4166f, 14.2552f, 19.4166f, 12.0f)
                curveTo(19.4166f, 10.6237f, 18.7357f, 9.4064f, 17.6924f, 8.6667f)
                curveTo(18.7357f, 7.9269f, 19.4166f, 6.7097f, 19.4166f, 5.3333f)
                curveTo(19.4166f, 3.0782f, 17.5885f, 1.25f, 15.3333f, 1.25f)
                horizontalLineTo(8.6666f)
                close()
                moveTo(11.25f, 14.5833f)
                horizontalLineTo(8.6666f)
                curveTo(7.2399f, 14.5833f, 6.0833f, 13.4267f, 6.0833f, 12.0f)
                curveTo(6.0833f, 10.5733f, 7.2399f, 9.4167f, 8.6666f, 9.4167f)
                lineTo(11.25f, 9.4167f)
                lineTo(11.25f, 12.0f)
                lineTo(11.25f, 14.5833f)
                close()
                moveTo(8.6666f, 7.9167f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.75f)
                horizontalLineTo(8.6666f)
                curveTo(7.2399f, 2.75f, 6.0833f, 3.9066f, 6.0833f, 5.3333f)
                curveTo(6.0833f, 6.7601f, 7.2399f, 7.9167f, 8.6666f, 7.9167f)
                close()
                moveTo(17.9166f, 5.3333f)
                curveTo(17.9166f, 6.7591f, 16.7615f, 7.9152f, 15.3361f, 7.9167f)
                lineTo(14.043f, 7.9167f)
                lineTo(12.75f, 7.9167f)
                lineTo(12.75f, 2.75f)
                horizontalLineTo(15.3333f)
                curveTo(16.76f, 2.75f, 17.9166f, 3.9066f, 17.9166f, 5.3333f)
                close()
                moveTo(12.75f, 11.9968f)
                curveTo(12.7517f, 10.5726f, 13.9059f, 9.4184f, 15.3301f, 9.4167f)
                lineTo(15.3358f, 9.4167f)
                curveTo(16.7614f, 9.418f, 17.9166f, 10.5741f, 17.9166f, 12.0f)
                curveTo(17.9166f, 13.4267f, 16.76f, 14.5833f, 15.3333f, 14.5833f)
                curveTo(13.9076f, 14.5833f, 12.7517f, 13.4284f, 12.75f, 12.0032f)
                verticalLineTo(11.9968f)
                close()
                moveTo(8.6666f, 16.0833f)
                curveTo(7.2399f, 16.0833f, 6.0833f, 17.2399f, 6.0833f, 18.6667f)
                curveTo(6.0833f, 20.0934f, 7.2399f, 21.25f, 8.6666f, 21.25f)
                curveTo(10.0934f, 21.25f, 11.25f, 20.0934f, 11.25f, 18.6667f)
                verticalLineTo(16.0833f)
                horizontalLineTo(8.6666f)
                close()
            }
        }
            .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
