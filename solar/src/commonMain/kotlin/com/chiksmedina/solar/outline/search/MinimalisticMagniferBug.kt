package com.chiksmedina.solar.outline.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SearchGroup

val SearchGroup.MinimalisticMagniferBug: ImageVector
    get() {
        if (_minimalisticMagniferBug != null) {
            return _minimalisticMagniferBug!!
        }
        _minimalisticMagniferBug = Builder(
            name = "MinimalisticMagniferBug", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5f, 2.75f)
                curveTo(6.6675f, 2.75f, 2.75f, 6.6675f, 2.75f, 11.5f)
                curveTo(2.75f, 16.3325f, 6.6675f, 20.25f, 11.5f, 20.25f)
                curveTo(16.3325f, 20.25f, 20.25f, 16.3325f, 20.25f, 11.5f)
                curveTo(20.25f, 6.6675f, 16.3325f, 2.75f, 11.5f, 2.75f)
                close()
                moveTo(1.25f, 11.5f)
                curveTo(1.25f, 5.8391f, 5.8391f, 1.25f, 11.5f, 1.25f)
                curveTo(17.1609f, 1.25f, 21.75f, 5.8391f, 21.75f, 11.5f)
                curveTo(21.75f, 17.1609f, 17.1609f, 21.75f, 11.5f, 21.75f)
                curveTo(5.8391f, 21.75f, 1.25f, 17.1609f, 1.25f, 11.5f)
                close()
                moveTo(8.5489f, 8.1859f)
                curveTo(9.2355f, 7.3116f, 10.3021f, 6.75f, 11.5f, 6.75f)
                curveTo(12.6979f, 6.75f, 13.7645f, 7.3116f, 14.4511f, 8.1859f)
                lineTo(15.1646f, 7.8292f)
                curveTo(15.5351f, 7.6439f, 15.9856f, 7.7941f, 16.1708f, 8.1646f)
                curveTo(16.3561f, 8.5351f, 16.2059f, 8.9856f, 15.8354f, 9.1708f)
                lineTo(15.1226f, 9.5272f)
                curveTo(15.2057f, 9.8375f, 15.25f, 10.1636f, 15.25f, 10.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 10.75f, 16.75f, 11.0858f, 16.75f, 11.5f)
                curveTo(16.75f, 11.9142f, 16.4142f, 12.25f, 16.0f, 12.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(12.5f)
                curveTo(15.25f, 12.8364f, 15.2057f, 13.1625f, 15.1226f, 13.4728f)
                lineTo(15.8354f, 13.8292f)
                curveTo(16.2059f, 14.0144f, 16.3561f, 14.4649f, 16.1708f, 14.8354f)
                curveTo(15.9856f, 15.2059f, 15.5351f, 15.3561f, 15.1646f, 15.1708f)
                lineTo(14.4511f, 14.8141f)
                curveTo(13.7645f, 15.6884f, 12.6979f, 16.25f, 11.5f, 16.25f)
                curveTo(10.3021f, 16.25f, 9.2355f, 15.6884f, 8.5489f, 14.8141f)
                lineTo(7.8354f, 15.1708f)
                curveTo(7.4649f, 15.3561f, 7.0144f, 15.2059f, 6.8292f, 14.8354f)
                curveTo(6.6439f, 14.4649f, 6.7941f, 14.0144f, 7.1646f, 13.8292f)
                lineTo(7.8774f, 13.4728f)
                curveTo(7.7943f, 13.1625f, 7.75f, 12.8364f, 7.75f, 12.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 12.25f, 6.25f, 11.9142f, 6.25f, 11.5f)
                curveTo(6.25f, 11.0858f, 6.5858f, 10.75f, 7.0f, 10.75f)
                horizontalLineTo(7.75f)
                verticalLineTo(10.5f)
                curveTo(7.75f, 10.1636f, 7.7943f, 9.8375f, 7.8774f, 9.5272f)
                lineTo(7.1646f, 9.1708f)
                curveTo(6.7941f, 8.9856f, 6.6439f, 8.5351f, 6.8292f, 8.1646f)
                curveTo(7.0144f, 7.7941f, 7.4649f, 7.6439f, 7.8354f, 7.8292f)
                lineTo(8.5489f, 8.1859f)
                close()
                moveTo(9.25f, 11.25f)
                verticalLineTo(12.5f)
                curveTo(9.25f, 13.4797f, 9.8761f, 14.3131f, 10.75f, 14.622f)
                verticalLineTo(11.25f)
                horizontalLineTo(9.25f)
                close()
                moveTo(12.25f, 11.25f)
                verticalLineTo(14.622f)
                curveTo(13.1239f, 14.3131f, 13.75f, 13.4797f, 13.75f, 12.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.25f)
                close()
                moveTo(13.622f, 9.75f)
                horizontalLineTo(9.378f)
                curveTo(9.6869f, 8.8761f, 10.5203f, 8.25f, 11.5f, 8.25f)
                curveTo(12.4797f, 8.25f, 13.3131f, 8.8761f, 13.622f, 9.75f)
                close()
                moveTo(19.4697f, 19.4697f)
                curveTo(19.7626f, 19.1768f, 20.2374f, 19.1768f, 20.5303f, 19.4697f)
                lineTo(22.5303f, 21.4697f)
                curveTo(22.8232f, 21.7626f, 22.8232f, 22.2374f, 22.5303f, 22.5303f)
                curveTo(22.2374f, 22.8232f, 21.7626f, 22.8232f, 21.4697f, 22.5303f)
                lineTo(19.4697f, 20.5303f)
                curveTo(19.1768f, 20.2374f, 19.1768f, 19.7626f, 19.4697f, 19.4697f)
                close()
            }
        }
            .build()
        return _minimalisticMagniferBug!!
    }

private var _minimalisticMagniferBug: ImageVector? = null
