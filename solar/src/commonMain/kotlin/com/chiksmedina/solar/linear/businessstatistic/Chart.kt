package com.chiksmedina.solar.linear.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.BusinessStatisticGroup

val BusinessStatisticGroup.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(
            name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 22.0f)
                verticalLineTo(14.5f)
                curveTo(21.0f, 13.6716f, 20.3284f, 13.0f, 19.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(15.6716f, 13.0f, 15.0f, 13.6716f, 15.0f, 14.5f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 22.0f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 3.5858f, 15.0f, 2.8787f, 14.5607f, 2.4393f)
                curveTo(14.1213f, 2.0f, 13.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(10.5858f, 2.0f, 9.8787f, 2.0f, 9.4393f, 2.4393f)
                curveTo(9.0f, 2.8787f, 9.0f, 3.5858f, 9.0f, 5.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 22.0f)
                verticalLineTo(9.5f)
                curveTo(9.0f, 8.6716f, 8.3284f, 8.0f, 7.5f, 8.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 8.0f, 3.0f, 8.6716f, 3.0f, 9.5f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
