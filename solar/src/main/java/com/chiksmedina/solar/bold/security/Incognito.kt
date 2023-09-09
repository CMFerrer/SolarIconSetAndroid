package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.6138f, 8.5448f)
                lineTo(4.1875f, 10.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 10.25f, 1.25f, 10.5858f, 1.25f, 11.0f)
                curveTo(1.25f, 11.4142f, 1.5858f, 11.75f, 2.0f, 11.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.75f, 22.75f, 11.4142f, 22.75f, 11.0f)
                curveTo(22.75f, 10.5858f, 22.4142f, 10.25f, 22.0f, 10.25f)
                horizontalLineTo(19.8125f)
                lineTo(19.3862f, 8.5448f)
                curveTo(18.8405f, 6.3621f, 18.5677f, 5.2708f, 17.7539f, 4.6354f)
                curveTo(16.9401f, 4.0f, 15.8152f, 4.0f, 13.5653f, 4.0f)
                horizontalLineTo(10.4347f)
                curveTo(8.1848f, 4.0f, 7.0599f, 4.0f, 6.2461f, 4.6354f)
                curveTo(5.4323f, 5.2708f, 5.1595f, 6.3621f, 4.6138f, 8.5448f)
                close()
                moveTo(6.5f, 21.0f)
                curveTo(8.1232f, 21.0f, 9.4883f, 19.8951f, 9.8842f, 18.3963f)
                lineTo(10.9938f, 17.8415f)
                curveTo(11.6272f, 17.5248f, 12.3728f, 17.5248f, 13.0062f, 17.8415f)
                lineTo(14.1158f, 18.3963f)
                curveTo(14.5117f, 19.8951f, 15.8768f, 21.0f, 17.5f, 21.0f)
                curveTo(19.433f, 21.0f, 21.0f, 19.433f, 21.0f, 17.5f)
                curveTo(21.0f, 15.567f, 19.433f, 14.0f, 17.5f, 14.0f)
                curveTo(15.8399f, 14.0f, 14.4498f, 15.1558f, 14.0903f, 16.7065f)
                lineTo(13.6771f, 16.4999f)
                curveTo(12.6213f, 15.972f, 11.3787f, 15.972f, 10.3229f, 16.4999f)
                lineTo(9.9097f, 16.7065f)
                curveTo(9.5502f, 15.1558f, 8.1601f, 14.0f, 6.5f, 14.0f)
                curveTo(4.567f, 14.0f, 3.0f, 15.567f, 3.0f, 17.5f)
                curveTo(3.0f, 19.433f, 4.567f, 21.0f, 6.5f, 21.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
