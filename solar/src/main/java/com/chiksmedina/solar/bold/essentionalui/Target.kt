package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.2479f, 2.0f)
                curveTo(6.3093f, 2.3662f, 2.3662f, 6.3093f, 2.0f, 11.2479f)
                horizontalLineTo(4.9806f)
                curveTo(5.3959f, 11.2479f, 5.7326f, 11.5846f, 5.7326f, 12.0f)
                curveTo(5.7326f, 12.4154f, 5.3959f, 12.7521f, 4.9806f, 12.7521f)
                horizontalLineTo(2.0f)
                curveTo(2.3662f, 17.6907f, 6.3093f, 21.6338f, 11.2479f, 22.0f)
                verticalLineTo(19.0194f)
                curveTo(11.2479f, 18.6041f, 11.5846f, 18.2674f, 12.0f, 18.2674f)
                curveTo(12.4154f, 18.2674f, 12.7521f, 18.6041f, 12.7521f, 19.0194f)
                verticalLineTo(22.0f)
                curveTo(17.6907f, 21.6338f, 21.6338f, 17.6907f, 22.0f, 12.7521f)
                horizontalLineTo(19.0194f)
                curveTo(18.6041f, 12.7521f, 18.2674f, 12.4154f, 18.2674f, 12.0f)
                curveTo(18.2674f, 11.5846f, 18.6041f, 11.2479f, 19.0194f, 11.2479f)
                horizontalLineTo(22.0f)
                curveTo(21.6338f, 6.3093f, 17.6907f, 2.3662f, 12.7521f, 2.0f)
                verticalLineTo(4.9806f)
                curveTo(12.7521f, 5.3959f, 12.4154f, 5.7326f, 12.0f, 5.7326f)
                curveTo(11.5846f, 5.7326f, 11.2479f, 5.3959f, 11.2479f, 4.9806f)
                verticalLineTo(2.0f)
                close()
                moveTo(9.2424f, 12.0f)
                curveTo(9.2424f, 11.5846f, 9.5791f, 11.2479f, 9.9944f, 11.2479f)
                horizontalLineTo(11.2479f)
                verticalLineTo(9.9944f)
                curveTo(11.2479f, 9.5791f, 11.5846f, 9.2424f, 12.0f, 9.2424f)
                curveTo(12.4154f, 9.2424f, 12.7521f, 9.5791f, 12.7521f, 9.9944f)
                verticalLineTo(11.2479f)
                horizontalLineTo(14.0056f)
                curveTo(14.4209f, 11.2479f, 14.7576f, 11.5846f, 14.7576f, 12.0f)
                curveTo(14.7576f, 12.4154f, 14.4209f, 12.7521f, 14.0056f, 12.7521f)
                horizontalLineTo(12.7521f)
                verticalLineTo(14.0056f)
                curveTo(12.7521f, 14.4209f, 12.4154f, 14.7576f, 12.0f, 14.7576f)
                curveTo(11.5846f, 14.7576f, 11.2479f, 14.4209f, 11.2479f, 14.0056f)
                verticalLineTo(12.7521f)
                horizontalLineTo(9.9944f)
                curveTo(9.5791f, 12.7521f, 9.2424f, 12.4154f, 9.2424f, 12.0f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
