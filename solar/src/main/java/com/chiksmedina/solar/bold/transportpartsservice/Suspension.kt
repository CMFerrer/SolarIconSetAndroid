package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.Suspension: ImageVector
    get() {
        if (_suspension != null) {
            return _suspension!!
        }
        _suspension = Builder(name = "Suspension", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.5f)
                verticalLineTo(4.5f)
                curveTo(3.0f, 4.0353f, 3.0f, 3.803f, 3.0384f, 3.6098f)
                curveTo(3.1962f, 2.8164f, 3.8164f, 2.1962f, 4.6098f, 2.0384f)
                curveTo(4.803f, 2.0f, 5.0353f, 2.0f, 5.5f, 2.0f)
                curveTo(5.9647f, 2.0f, 6.197f, 2.0f, 6.3902f, 2.0384f)
                curveTo(7.1836f, 2.1962f, 7.8038f, 2.8164f, 7.9616f, 3.6098f)
                curveTo(8.0f, 3.803f, 8.0f, 4.0353f, 8.0f, 4.5f)
                verticalLineTo(4.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 4.0353f, 16.0f, 3.803f, 16.0384f, 3.6098f)
                curveTo(16.1962f, 2.8164f, 16.8164f, 2.1962f, 17.6098f, 2.0384f)
                curveTo(17.803f, 2.0f, 18.0353f, 2.0f, 18.5f, 2.0f)
                curveTo(18.9647f, 2.0f, 19.197f, 2.0f, 19.3902f, 2.0384f)
                curveTo(20.1836f, 2.1962f, 20.8038f, 2.8164f, 20.9616f, 3.6098f)
                curveTo(21.0f, 3.803f, 21.0f, 4.0353f, 21.0f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 6.9647f, 21.0f, 7.197f, 20.9616f, 7.3902f)
                curveTo(20.8038f, 8.1836f, 20.1836f, 8.8038f, 19.3902f, 8.9616f)
                curveTo(19.197f, 9.0f, 18.9647f, 9.0f, 18.5f, 9.0f)
                curveTo(18.0353f, 9.0f, 17.803f, 9.0f, 17.6098f, 8.9616f)
                curveTo(16.8164f, 8.8038f, 16.1962f, 8.1836f, 16.0384f, 7.3902f)
                curveTo(16.0f, 7.197f, 16.0f, 6.9647f, 16.0f, 6.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.5f)
                curveTo(16.0f, 17.0353f, 16.0f, 16.803f, 16.0384f, 16.6098f)
                curveTo(16.1962f, 15.8164f, 16.8164f, 15.1962f, 17.6098f, 15.0384f)
                curveTo(17.803f, 15.0f, 18.0353f, 15.0f, 18.5f, 15.0f)
                curveTo(18.9647f, 15.0f, 19.197f, 15.0f, 19.3902f, 15.0384f)
                curveTo(20.1836f, 15.1962f, 20.8038f, 15.8164f, 20.9616f, 16.6098f)
                curveTo(21.0f, 16.803f, 21.0f, 17.0353f, 21.0f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(21.0f, 19.9647f, 21.0f, 20.197f, 20.9616f, 20.3902f)
                curveTo(20.8038f, 21.1836f, 20.1836f, 21.8038f, 19.3902f, 21.9616f)
                curveTo(19.197f, 22.0f, 18.9647f, 22.0f, 18.5f, 22.0f)
                curveTo(18.0353f, 22.0f, 17.803f, 22.0f, 17.6098f, 21.9616f)
                curveTo(16.8164f, 21.8038f, 16.1962f, 21.1836f, 16.0384f, 20.3902f)
                curveTo(16.0f, 20.197f, 16.0f, 19.9647f, 16.0f, 19.5f)
                verticalLineTo(19.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.5f)
                curveTo(8.0f, 19.9647f, 8.0f, 20.197f, 7.9616f, 20.3902f)
                curveTo(7.8038f, 21.1836f, 7.1836f, 21.8038f, 6.3902f, 21.9616f)
                curveTo(6.197f, 22.0f, 5.9647f, 22.0f, 5.5f, 22.0f)
                curveTo(5.0353f, 22.0f, 4.803f, 22.0f, 4.6098f, 21.9616f)
                curveTo(3.8164f, 21.8038f, 3.1962f, 21.1836f, 3.0384f, 20.3902f)
                curveTo(3.0f, 20.197f, 3.0f, 19.9647f, 3.0f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(3.0f, 17.0353f, 3.0f, 16.803f, 3.0384f, 16.6098f)
                curveTo(3.1962f, 15.8164f, 3.8164f, 15.1962f, 4.6098f, 15.0384f)
                curveTo(4.803f, 15.0f, 5.0353f, 15.0f, 5.5f, 15.0f)
                curveTo(5.9647f, 15.0f, 6.197f, 15.0f, 6.3902f, 15.0384f)
                curveTo(7.1836f, 15.1962f, 7.8038f, 15.8164f, 7.9616f, 16.6098f)
                curveTo(8.0f, 16.803f, 8.0f, 17.0353f, 8.0f, 17.5f)
                verticalLineTo(17.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5f)
                curveTo(8.0f, 6.9647f, 8.0f, 7.197f, 7.9616f, 7.3902f)
                curveTo(7.8038f, 8.1836f, 7.1836f, 8.8038f, 6.3902f, 8.9616f)
                curveTo(6.197f, 9.0f, 5.9647f, 9.0f, 5.5f, 9.0f)
                curveTo(5.0353f, 9.0f, 4.803f, 9.0f, 4.6098f, 8.9616f)
                curveTo(3.8164f, 8.8038f, 3.1962f, 8.1836f, 3.0384f, 7.3902f)
                curveTo(3.0f, 7.197f, 3.0f, 6.9647f, 3.0f, 6.5f)
                close()
            }
        }
        .build()
        return _suspension!!
    }

private var _suspension: ImageVector? = null
