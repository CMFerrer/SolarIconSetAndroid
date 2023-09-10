package com.chiksmedina.solar.bold.transportpartsservice

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
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(
            name = "Transmission", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                curveTo(5.1046f, 2.0f, 6.0f, 2.8954f, 6.0f, 4.0f)
                curveTo(6.0f, 4.8393f, 5.483f, 5.5579f, 4.75f, 5.8546f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.8546f)
                curveTo(10.517f, 5.5579f, 10.0f, 4.8393f, 10.0f, 4.0f)
                curveTo(10.0f, 2.8954f, 10.8954f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
                curveTo(14.0f, 4.8393f, 13.483f, 5.5579f, 12.75f, 5.8546f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.964f, 11.25f, 17.6116f, 11.2484f, 18.0946f, 11.1835f)
                curveTo(18.5561f, 11.1214f, 18.7536f, 11.0142f, 18.8839f, 10.8839f)
                curveTo(19.0142f, 10.7536f, 19.1214f, 10.5561f, 19.1835f, 10.0946f)
                curveTo(19.2484f, 9.6116f, 19.25f, 8.964f, 19.25f, 8.0f)
                verticalLineTo(5.8546f)
                curveTo(18.517f, 5.5579f, 18.0f, 4.8393f, 18.0f, 4.0f)
                curveTo(18.0f, 2.8954f, 18.8954f, 2.0f, 20.0f, 2.0f)
                curveTo(21.1046f, 2.0f, 22.0f, 2.8954f, 22.0f, 4.0f)
                curveTo(22.0f, 4.8393f, 21.483f, 5.5579f, 20.75f, 5.8546f)
                verticalLineTo(8.052f)
                curveTo(20.75f, 8.9505f, 20.7501f, 9.6997f, 20.6701f, 10.2945f)
                curveTo(20.5857f, 10.9223f, 20.4f, 11.4891f, 19.9445f, 11.9445f)
                curveTo(19.4891f, 12.4f, 18.9223f, 12.5857f, 18.2945f, 12.6701f)
                curveTo(17.6997f, 12.7501f, 16.9505f, 12.75f, 16.052f, 12.75f)
                lineTo(12.75f, 12.75f)
                lineTo(12.75f, 18.1454f)
                curveTo(13.483f, 18.4421f, 14.0f, 19.1607f, 14.0f, 20.0f)
                curveTo(14.0f, 21.1046f, 13.1046f, 22.0f, 12.0f, 22.0f)
                curveTo(10.8954f, 22.0f, 10.0f, 21.1046f, 10.0f, 20.0f)
                curveTo(10.0f, 19.1607f, 10.517f, 18.4421f, 11.25f, 18.1454f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.75f)
                verticalLineTo(18.1454f)
                curveTo(5.483f, 18.4421f, 6.0f, 19.1607f, 6.0f, 20.0f)
                curveTo(6.0f, 21.1046f, 5.1046f, 22.0f, 4.0f, 22.0f)
                curveTo(2.8954f, 22.0f, 2.0f, 21.1046f, 2.0f, 20.0f)
                curveTo(2.0f, 19.1607f, 2.517f, 18.4421f, 3.25f, 18.1454f)
                verticalLineTo(5.8546f)
                curveTo(2.517f, 5.5579f, 2.0f, 4.8393f, 2.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.25f, 15.0f)
                curveTo(17.25f, 14.5858f, 17.5858f, 14.25f, 18.0f, 14.25f)
                horizontalLineTo(20.2857f)
                curveTo(21.6612f, 14.25f, 22.75f, 15.3839f, 22.75f, 16.75f)
                curveTo(22.75f, 17.8285f, 22.0713f, 18.7624f, 21.1086f, 19.1077f)
                lineTo(22.6396f, 21.6084f)
                curveTo(22.8559f, 21.9616f, 22.7449f, 22.4234f, 22.3916f, 22.6396f)
                curveTo(22.0384f, 22.8559f, 21.5766f, 22.7449f, 21.3604f, 22.3916f)
                lineTo(19.4369f, 19.25f)
                horizontalLineTo(18.75f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(18.75f, 17.75f)
                horizontalLineTo(20.2857f)
                curveTo(20.8038f, 17.75f, 21.25f, 17.3169f, 21.25f, 16.75f)
                curveTo(21.25f, 16.1831f, 20.8038f, 15.75f, 20.2857f, 15.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(17.75f)
                close()
            }
        }
            .build()
        return _transmission!!
    }

private var _transmission: ImageVector? = null
