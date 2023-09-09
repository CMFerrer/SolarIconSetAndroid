package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.SuspensionCross: ImageVector
    get() {
        if (_suspensionCross != null) {
            return _suspensionCross!!
        }
        _suspensionCross = Builder(name = "SuspensionCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 4.0353f, 8.0f, 3.803f, 7.9616f, 3.6098f)
                curveTo(7.8038f, 2.8164f, 7.1836f, 2.1962f, 6.3902f, 2.0384f)
                curveTo(6.197f, 2.0f, 5.9647f, 2.0f, 5.5f, 2.0f)
                curveTo(5.0353f, 2.0f, 4.803f, 2.0f, 4.6098f, 2.0384f)
                curveTo(3.8164f, 2.1962f, 3.1962f, 2.8164f, 3.0384f, 3.6098f)
                curveTo(3.0f, 3.803f, 3.0f, 4.0353f, 3.0f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 6.9647f, 3.0f, 7.197f, 3.0384f, 7.3902f)
                curveTo(3.1962f, 8.1836f, 3.8164f, 8.8038f, 4.6098f, 8.9616f)
                curveTo(4.803f, 9.0f, 5.0353f, 9.0f, 5.5f, 9.0f)
                curveTo(5.9647f, 9.0f, 6.197f, 9.0f, 6.3902f, 8.9616f)
                curveTo(7.1836f, 8.8038f, 7.8038f, 8.1836f, 7.9616f, 7.3902f)
                curveTo(8.0f, 7.197f, 8.0f, 6.9647f, 8.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(21.0f, 4.0353f, 21.0f, 3.803f, 20.9616f, 3.6098f)
                curveTo(20.8038f, 2.8164f, 20.1836f, 2.1962f, 19.3902f, 2.0384f)
                curveTo(19.197f, 2.0f, 18.9647f, 2.0f, 18.5f, 2.0f)
                curveTo(18.0353f, 2.0f, 17.803f, 2.0f, 17.6098f, 2.0384f)
                curveTo(16.8164f, 2.1962f, 16.1962f, 2.8164f, 16.0384f, 3.6098f)
                curveTo(16.0f, 3.803f, 16.0f, 4.0353f, 16.0f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(16.0f, 6.9647f, 16.0f, 7.197f, 16.0384f, 7.3902f)
                curveTo(16.1962f, 8.1836f, 16.8164f, 8.8038f, 17.6098f, 8.9616f)
                curveTo(17.803f, 9.0f, 18.0353f, 9.0f, 18.5f, 9.0f)
                curveTo(18.9647f, 9.0f, 19.197f, 9.0f, 19.3902f, 8.9616f)
                curveTo(20.1836f, 8.8038f, 20.8038f, 8.1836f, 20.9616f, 7.3902f)
                curveTo(21.0f, 7.197f, 21.0f, 6.9647f, 21.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(8.0f, 17.0353f, 8.0f, 16.803f, 7.9616f, 16.6098f)
                curveTo(7.8038f, 15.8164f, 7.1836f, 15.1962f, 6.3902f, 15.0384f)
                curveTo(6.197f, 15.0f, 5.9647f, 15.0f, 5.5f, 15.0f)
                curveTo(5.0353f, 15.0f, 4.803f, 15.0f, 4.6098f, 15.0384f)
                curveTo(3.8164f, 15.1962f, 3.1962f, 15.8164f, 3.0384f, 16.6098f)
                curveTo(3.0f, 16.803f, 3.0f, 17.0353f, 3.0f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(3.0f, 19.9647f, 3.0f, 20.197f, 3.0384f, 20.3902f)
                curveTo(3.1962f, 21.1836f, 3.8164f, 21.8038f, 4.6098f, 21.9616f)
                curveTo(4.803f, 22.0f, 5.0353f, 22.0f, 5.5f, 22.0f)
                curveTo(5.9647f, 22.0f, 6.197f, 22.0f, 6.3902f, 21.9616f)
                curveTo(7.1836f, 21.8038f, 7.8038f, 21.1836f, 7.9616f, 20.3902f)
                curveTo(8.0f, 20.197f, 8.0f, 19.9647f, 8.0f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 17.0353f, 21.0f, 16.803f, 20.9616f, 16.6098f)
                curveTo(20.8038f, 15.8164f, 20.1836f, 15.1962f, 19.3902f, 15.0384f)
                curveTo(19.197f, 15.0f, 18.9647f, 15.0f, 18.5f, 15.0f)
                curveTo(18.0353f, 15.0f, 17.803f, 15.0f, 17.6098f, 15.0384f)
                curveTo(16.8164f, 15.1962f, 16.1962f, 15.8164f, 16.0384f, 16.6098f)
                curveTo(16.0f, 16.803f, 16.0f, 17.0353f, 16.0f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(16.0f, 19.9647f, 16.0f, 20.197f, 16.0384f, 20.3902f)
                curveTo(16.1962f, 21.1836f, 16.8164f, 21.8038f, 17.6098f, 21.9616f)
                curveTo(17.803f, 22.0f, 18.0353f, 22.0f, 18.5f, 22.0f)
                curveTo(18.9647f, 22.0f, 19.197f, 22.0f, 19.3902f, 21.9616f)
                curveTo(20.1836f, 21.8038f, 20.8038f, 21.1836f, 20.9616f, 20.3902f)
                curveTo(21.0f, 20.197f, 21.0f, 19.9647f, 21.0f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 4.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 8.4142f, 12.4142f, 8.75f, 12.0f, 8.75f)
                curveTo(11.5858f, 8.75f, 11.25f, 8.4142f, 11.25f, 8.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.75f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 15.25f)
                curveTo(12.4142f, 15.25f, 12.75f, 15.5858f, 12.75f, 16.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 15.5858f, 11.5858f, 15.25f, 12.0f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.4697f, 9.4697f)
                curveTo(9.7626f, 9.1768f, 10.2374f, 9.1768f, 10.5303f, 9.4697f)
                lineTo(12.0f, 10.9393f)
                lineTo(13.4697f, 9.4697f)
                curveTo(13.7626f, 9.1768f, 14.2374f, 9.1768f, 14.5303f, 9.4697f)
                curveTo(14.8232f, 9.7626f, 14.8232f, 10.2374f, 14.5303f, 10.5303f)
                lineTo(13.0607f, 12.0f)
                lineTo(14.5303f, 13.4697f)
                curveTo(14.8232f, 13.7626f, 14.8232f, 14.2374f, 14.5303f, 14.5303f)
                curveTo(14.2374f, 14.8232f, 13.7626f, 14.8232f, 13.4697f, 14.5303f)
                lineTo(12.0f, 13.0607f)
                lineTo(10.5303f, 14.5303f)
                curveTo(10.2374f, 14.8232f, 9.7626f, 14.8232f, 9.4697f, 14.5303f)
                curveTo(9.1768f, 14.2374f, 9.1768f, 13.7626f, 9.4697f, 13.4697f)
                lineTo(10.9393f, 12.0f)
                lineTo(9.4697f, 10.5303f)
                curveTo(9.1768f, 10.2374f, 9.1768f, 9.7626f, 9.4697f, 9.4697f)
                close()
            }
        }
        .build()
        return _suspensionCross!!
    }

private var _suspensionCross: ImageVector? = null
