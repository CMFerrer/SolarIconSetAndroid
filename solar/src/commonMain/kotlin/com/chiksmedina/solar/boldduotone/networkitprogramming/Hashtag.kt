package com.chiksmedina.solar.boldduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(
            name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2007f, 2.2773f)
                curveTo(10.5998f, 2.3882f, 10.8334f, 2.8016f, 10.7226f, 3.2007f)
                lineTo(5.7226f, 21.2007f)
                curveTo(5.6117f, 21.5998f, 5.1983f, 21.8334f, 4.7992f, 21.7226f)
                curveTo(4.4001f, 21.6117f, 4.1665f, 21.1983f, 4.2773f, 20.7992f)
                lineTo(9.2773f, 2.7992f)
                curveTo(9.3882f, 2.4001f, 9.8016f, 2.1665f, 10.2007f, 2.2773f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.2007f, 2.2773f)
                curveTo(19.5998f, 2.3882f, 19.8334f, 2.8016f, 19.7226f, 3.2007f)
                lineTo(14.7226f, 21.2007f)
                curveTo(14.6117f, 21.5998f, 14.1983f, 21.8334f, 13.7992f, 21.7226f)
                curveTo(13.4001f, 21.6117f, 13.1664f, 21.1983f, 13.2773f, 20.7992f)
                lineTo(18.2773f, 2.7992f)
                curveTo(18.3882f, 2.4001f, 18.8016f, 2.1665f, 19.2007f, 2.2773f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(3.25f, 9.0f)
                curveTo(3.25f, 8.5858f, 3.5858f, 8.25f, 4.0f, 8.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 8.25f, 22.75f, 8.5858f, 22.75f, 9.0f)
                curveTo(22.75f, 9.4142f, 22.4142f, 9.75f, 22.0f, 9.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 9.75f, 3.25f, 9.4142f, 3.25f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 15.25f, 20.75f, 15.5858f, 20.75f, 16.0f)
                curveTo(20.75f, 16.4142f, 20.4142f, 16.75f, 20.0f, 16.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 16.75f, 1.25f, 16.4142f, 1.25f, 16.0f)
                close()
            }
        }
            .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
