package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.CircleTopUp: ImageVector
    get() {
        if (_circleTopUp != null) {
            return _circleTopUp!!
        }
        _circleTopUp = Builder(
            name = "CircleTopUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5f, 2.75f)
                curveTo(14.5f, 2.3358f, 14.8358f, 2.0f, 15.25f, 2.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 2.0f, 22.0f, 2.3358f, 22.0f, 2.75f)
                verticalLineTo(8.75f)
                curveTo(22.0f, 9.1642f, 21.6642f, 9.5f, 21.25f, 9.5f)
                curveTo(20.8358f, 9.5f, 20.5f, 9.1642f, 20.5f, 8.75f)
                verticalLineTo(4.5607f)
                lineTo(13.7803f, 11.2803f)
                curveTo(13.4874f, 11.5732f, 13.0126f, 11.5732f, 12.7197f, 11.2803f)
                curveTo(12.4268f, 10.9874f, 12.4268f, 10.5126f, 12.7197f, 10.2197f)
                lineTo(19.4393f, 3.5f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 3.5f, 14.5f, 3.1642f, 14.5f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 2.75f)
                curveTo(5.7271f, 2.75f, 1.25f, 7.2271f, 1.25f, 12.75f)
                curveTo(1.25f, 18.2728f, 5.7271f, 22.75f, 11.25f, 22.75f)
                curveTo(16.7728f, 22.75f, 21.25f, 18.2728f, 21.25f, 12.75f)
                curveTo(21.25f, 12.1512f, 21.1974f, 11.5647f, 21.0965f, 10.9948f)
                curveTo(19.9254f, 10.9159f, 19.0f, 9.941f, 19.0f, 8.75f)
                verticalLineTo(8.182f)
                lineTo(14.841f, 12.341f)
                curveTo(13.9623f, 13.2197f, 12.5377f, 13.2197f, 11.659f, 12.341f)
                curveTo(10.7803f, 11.4623f, 10.7803f, 10.0377f, 11.659f, 9.159f)
                lineTo(15.818f, 5.0f)
                horizontalLineTo(15.25f)
                curveTo(14.059f, 5.0f, 13.0841f, 4.0746f, 13.0052f, 2.9035f)
                curveTo(12.4353f, 2.8026f, 11.8488f, 2.75f, 11.25f, 2.75f)
                close()
            }
        }
            .build()
        return _circleTopUp!!
    }

private var _circleTopUp: ImageVector? = null
