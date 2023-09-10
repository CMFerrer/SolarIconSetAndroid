package com.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.RoundGraph: ImageVector
    get() {
        if (_roundGraph != null) {
            return _roundGraph!!
        }
        _roundGraph = Builder(
            name = "RoundGraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(11.25f, 5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                curveTo(16.2802f, 4.25f, 19.75f, 7.7198f, 19.75f, 12.0f)
                curveTo(19.75f, 16.2802f, 16.2802f, 19.75f, 12.0f, 19.75f)
                curveTo(7.7198f, 19.75f, 4.25f, 16.2802f, 4.25f, 12.0f)
                curveTo(4.25f, 11.5858f, 4.5858f, 11.25f, 5.0f, 11.25f)
                curveTo(5.4142f, 11.25f, 5.75f, 11.5858f, 5.75f, 12.0f)
                curveTo(5.75f, 15.4518f, 8.5482f, 18.25f, 12.0f, 18.25f)
                curveTo(15.4518f, 18.25f, 18.25f, 15.4518f, 18.25f, 12.0f)
                curveTo(18.25f, 8.5482f, 15.4518f, 5.75f, 12.0f, 5.75f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                close()
                moveTo(12.0f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                curveTo(11.25f, 8.4142f, 11.5858f, 8.75f, 12.0f, 8.75f)
                curveTo(13.7949f, 8.75f, 15.25f, 10.2051f, 15.25f, 12.0f)
                curveTo(15.25f, 13.7949f, 13.7949f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 15.5858f, 11.25f, 16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                curveTo(14.6234f, 16.75f, 16.75f, 14.6234f, 16.75f, 12.0f)
                curveTo(16.75f, 9.3766f, 14.6234f, 7.25f, 12.0f, 7.25f)
                close()
            }
        }
            .build()
        return _roundGraph!!
    }

private var _roundGraph: ImageVector? = null
