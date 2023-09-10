package com.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TimeGroup

val TimeGroup.StopwatchPlay: ImageVector
    get() {
        if (_stopwatchPlay != null) {
            return _stopwatchPlay!!
        }
        _stopwatchPlay = Builder(
            name = "StopwatchPlay", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 2.75f)
                curveTo(9.25f, 2.3358f, 9.5858f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 2.0f, 14.75f, 2.3358f, 14.75f, 2.75f)
                curveTo(14.75f, 3.1642f, 14.4142f, 3.5f, 14.0f, 3.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 3.5f, 9.25f, 3.1642f, 9.25f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.0f, 13.75f)
                curveTo(21.0f, 18.7206f, 16.9706f, 22.75f, 12.0f, 22.75f)
                curveTo(7.0294f, 22.75f, 3.0f, 18.7206f, 3.0f, 13.75f)
                curveTo(3.0f, 8.7794f, 7.0294f, 4.75f, 12.0f, 4.75f)
                curveTo(16.9706f, 4.75f, 21.0f, 8.7794f, 21.0f, 13.75f)
                close()
                moveTo(13.0261f, 11.0249f)
                curveTo(12.7888f, 10.8583f, 12.5201f, 10.686f, 12.2419f, 10.5168f)
                curveTo(11.1695f, 9.8647f, 10.6333f, 9.5386f, 10.1524f, 9.8996f)
                curveTo(9.6715f, 10.2606f, 9.6278f, 11.0164f, 9.5404f, 12.5278f)
                curveTo(9.5157f, 12.9553f, 9.5f, 13.3743f, 9.5f, 13.75f)
                curveTo(9.5f, 14.1257f, 9.5157f, 14.5447f, 9.5404f, 14.9722f)
                curveTo(9.6278f, 16.4836f, 9.6715f, 17.2394f, 10.1524f, 17.6004f)
                curveTo(10.6333f, 17.9614f, 11.1695f, 17.6353f, 12.2419f, 16.9832f)
                curveTo(12.5201f, 16.814f, 12.7888f, 16.6417f, 13.0261f, 16.4751f)
                curveTo(13.2966f, 16.2852f, 13.5909f, 16.0573f, 13.8876f, 15.8152f)
                curveTo(14.9625f, 14.9383f, 15.5f, 14.4999f, 15.5f, 13.75f)
                curveTo(15.5f, 13.0001f, 14.9625f, 12.5617f, 13.8876f, 11.6848f)
                curveTo(13.5909f, 11.4427f, 13.2966f, 11.2148f, 13.0261f, 11.0249f)
                close()
            }
        }
            .build()
        return _stopwatchPlay!!
    }

private var _stopwatchPlay: ImageVector? = null
