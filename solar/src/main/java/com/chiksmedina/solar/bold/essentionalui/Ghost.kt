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

val EssentionalUiGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(
            name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 19.2058f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                verticalLineTo(19.2058f)
                curveTo(2.0f, 20.4896f, 3.351f, 21.3245f, 4.4992f, 20.7504f)
                curveTo(5.4273f, 20.2864f, 6.5328f, 20.3552f, 7.3961f, 20.9308f)
                curveTo(8.3674f, 21.5782f, 9.6326f, 21.5782f, 10.6039f, 20.9308f)
                lineTo(10.9565f, 20.6957f)
                curveTo(11.5884f, 20.2744f, 12.4116f, 20.2744f, 13.0435f, 20.6957f)
                lineTo(13.3961f, 20.9308f)
                curveTo(14.3674f, 21.5782f, 15.6326f, 21.5782f, 16.6039f, 20.9308f)
                curveTo(17.4672f, 20.3552f, 18.5727f, 20.2864f, 19.5008f, 20.7504f)
                curveTo(20.649f, 21.3245f, 22.0f, 20.4896f, 22.0f, 19.2058f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 11.3284f, 15.5523f, 12.0f, 15.0f, 12.0f)
                curveTo(14.4477f, 12.0f, 14.0f, 11.3284f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6716f, 14.4477f, 9.0f, 15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 9.6716f, 16.0f, 10.5f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.5523f, 12.0f, 10.0f, 11.3284f, 10.0f, 10.5f)
                curveTo(10.0f, 9.6716f, 9.5523f, 9.0f, 9.0f, 9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 9.6716f, 8.0f, 10.5f)
                curveTo(8.0f, 11.3284f, 8.4477f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
            .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
