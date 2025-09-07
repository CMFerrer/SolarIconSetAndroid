package com.chiksmedina.solar.outline.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

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
                moveTo(10.7226f, 3.2007f)
                curveTo(10.8335f, 2.8016f, 10.5998f, 2.3882f, 10.2007f, 2.2773f)
                curveTo(9.8016f, 2.1665f, 9.3882f, 2.4001f, 9.2774f, 2.7992f)
                lineTo(7.7633f, 8.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 8.25f, 3.25f, 8.5857f, 3.25f, 9.0f)
                curveTo(3.25f, 9.4142f, 3.5858f, 9.75f, 4.0f, 9.75f)
                horizontalLineTo(7.3466f)
                lineTo(5.8188f, 15.2499f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 15.2499f, 1.25f, 15.5857f, 1.25f, 15.9999f)
                curveTo(1.25f, 16.4142f, 1.5858f, 16.7499f, 2.0f, 16.7499f)
                horizontalLineTo(5.4022f)
                lineTo(4.2774f, 20.7992f)
                curveTo(4.1665f, 21.1983f, 4.4002f, 21.6117f, 4.7993f, 21.7226f)
                curveTo(5.1984f, 21.8334f, 5.6118f, 21.5998f, 5.7226f, 21.2007f)
                lineTo(6.959f, 16.7499f)
                horizontalLineTo(14.4022f)
                lineTo(13.2774f, 20.7992f)
                curveTo(13.1665f, 21.1983f, 13.4002f, 21.6117f, 13.7993f, 21.7226f)
                curveTo(14.1984f, 21.8334f, 14.6118f, 21.5998f, 14.7226f, 21.2007f)
                lineTo(15.959f, 16.7499f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 16.7499f, 20.75f, 16.4142f, 20.75f, 15.9999f)
                curveTo(20.75f, 15.5857f, 20.4142f, 15.2499f, 20.0f, 15.2499f)
                horizontalLineTo(16.3756f)
                lineTo(17.9034f, 9.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 9.75f, 22.75f, 9.4142f, 22.75f, 9.0f)
                curveTo(22.75f, 8.5857f, 22.4142f, 8.25f, 22.0f, 8.25f)
                horizontalLineTo(18.3201f)
                lineTo(19.7226f, 3.2007f)
                curveTo(19.8335f, 2.8016f, 19.5998f, 2.3882f, 19.2007f, 2.2773f)
                curveTo(18.8016f, 2.1665f, 18.3882f, 2.4001f, 18.2774f, 2.7992f)
                lineTo(16.7633f, 8.25f)
                horizontalLineTo(9.3201f)
                lineTo(10.7226f, 3.2007f)
                close()
                moveTo(14.8188f, 15.2499f)
                lineTo(16.3466f, 9.75f)
                horizontalLineTo(8.9034f)
                lineTo(7.3756f, 15.2499f)
                horizontalLineTo(14.8188f)
                close()
            }
        }
            .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
