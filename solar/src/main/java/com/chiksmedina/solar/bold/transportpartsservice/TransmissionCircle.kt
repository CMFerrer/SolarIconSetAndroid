package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.TransmissionCircle: ImageVector
    get() {
        if (_transmissionCircle != null) {
            return _transmissionCircle!!
        }
        _transmissionCircle = Builder(name = "TransmissionCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(8.0f, 8.25f)
                curveTo(8.4142f, 8.25f, 8.75f, 8.5858f, 8.75f, 9.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4762f, 11.25f, 13.7958f, 11.2496f, 14.0433f, 11.2327f)
                curveTo(14.284f, 11.2163f, 14.4012f, 11.1868f, 14.4784f, 11.1548f)
                curveTo(14.7846f, 11.028f, 15.028f, 10.7846f, 15.1549f, 10.4784f)
                curveTo(15.1868f, 10.4012f, 15.2163f, 10.284f, 15.2327f, 10.0433f)
                curveTo(15.2496f, 9.7958f, 15.25f, 9.4762f, 15.25f, 9.0f)
                curveTo(15.25f, 8.5858f, 15.5858f, 8.25f, 16.0f, 8.25f)
                curveTo(16.4142f, 8.25f, 16.75f, 8.5858f, 16.75f, 9.0f)
                verticalLineTo(9.0253f)
                curveTo(16.75f, 9.4697f, 16.75f, 9.8407f, 16.7292f, 10.1454f)
                curveTo(16.7076f, 10.4625f, 16.661f, 10.762f, 16.5407f, 11.0524f)
                curveTo(16.2616f, 11.7262f, 15.7262f, 12.2616f, 15.0524f, 12.5407f)
                curveTo(14.762f, 12.661f, 14.4625f, 12.7076f, 14.1454f, 12.7292f)
                curveTo(13.8408f, 12.75f, 13.4697f, 12.75f, 13.0253f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 15.4142f, 12.4142f, 15.75f, 12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(15.0f)
                curveTo(8.75f, 15.4142f, 8.4142f, 15.75f, 8.0f, 15.75f)
                curveTo(7.5858f, 15.75f, 7.25f, 15.4142f, 7.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(7.25f, 8.5858f, 7.5858f, 8.25f, 8.0f, 8.25f)
                close()
            }
        }
        .build()
        return _transmissionCircle!!
    }

private var _transmissionCircle: ImageVector? = null
