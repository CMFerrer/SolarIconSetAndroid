package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.RadialBlur: ImageVector
    get() {
        if (_radialBlur != null) {
            return _radialBlur!!
        }
        _radialBlur = Builder(
            name = "RadialBlur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.9997f, 20.66f)
                curveTo(12.2168f, 23.4214f, 6.1009f, 21.7826f, 3.3395f, 16.9997f)
                curveTo(0.578f, 12.2168f, 2.2168f, 6.1009f, 6.9997f, 3.3395f)
                curveTo(8.9493f, 2.2139f, 11.1204f, 1.8194f, 13.1955f, 2.0709f)
                curveTo(16.2112f, 2.4364f, 19.0242f, 4.1664f, 20.66f, 6.9997f)
                curveTo(22.2958f, 9.833f, 22.3875f, 13.1341f, 21.1962f, 15.9286f)
                curveTo(20.3765f, 17.8514f, 18.9493f, 19.5344f, 16.9997f, 20.66f)
                close()
                moveTo(14.25f, 6.5f)
                curveTo(14.6642f, 6.5f, 15.0f, 6.1642f, 15.0f, 5.75f)
                curveTo(15.0f, 5.3358f, 14.6642f, 5.0f, 14.25f, 5.0f)
                curveTo(13.8358f, 5.0f, 13.5f, 5.3358f, 13.5f, 5.75f)
                curveTo(13.5f, 6.1642f, 13.8358f, 6.5f, 14.25f, 6.5f)
                close()
                moveTo(14.25f, 11.0f)
                curveTo(14.9404f, 11.0f, 15.5f, 10.4404f, 15.5f, 9.75f)
                curveTo(15.5f, 9.0596f, 14.9404f, 8.5f, 14.25f, 8.5f)
                curveTo(13.5596f, 8.5f, 13.0f, 9.0596f, 13.0f, 9.75f)
                curveTo(13.0f, 10.4404f, 13.5596f, 11.0f, 14.25f, 11.0f)
                close()
                moveTo(14.25f, 15.5f)
                curveTo(14.9404f, 15.5f, 15.5f, 14.9404f, 15.5f, 14.25f)
                curveTo(15.5f, 13.5596f, 14.9404f, 13.0f, 14.25f, 13.0f)
                curveTo(13.5596f, 13.0f, 13.0f, 13.5596f, 13.0f, 14.25f)
                curveTo(13.0f, 14.9404f, 13.5596f, 15.5f, 14.25f, 15.5f)
                close()
                moveTo(11.0f, 14.25f)
                curveTo(11.0f, 14.9404f, 10.4404f, 15.5f, 9.75f, 15.5f)
                curveTo(9.0596f, 15.5f, 8.5f, 14.9404f, 8.5f, 14.25f)
                curveTo(8.5f, 13.5596f, 9.0596f, 13.0f, 9.75f, 13.0f)
                curveTo(10.4404f, 13.0f, 11.0f, 13.5596f, 11.0f, 14.25f)
                close()
                moveTo(9.75f, 11.0f)
                curveTo(10.4404f, 11.0f, 11.0f, 10.4404f, 11.0f, 9.75f)
                curveTo(11.0f, 9.0596f, 10.4404f, 8.5f, 9.75f, 8.5f)
                curveTo(9.0596f, 8.5f, 8.5f, 9.0596f, 8.5f, 9.75f)
                curveTo(8.5f, 10.4404f, 9.0596f, 11.0f, 9.75f, 11.0f)
                close()
                moveTo(15.0f, 18.25f)
                curveTo(15.0f, 18.6642f, 14.6642f, 19.0f, 14.25f, 19.0f)
                curveTo(13.8358f, 19.0f, 13.5f, 18.6642f, 13.5f, 18.25f)
                curveTo(13.5f, 17.8358f, 13.8358f, 17.5f, 14.25f, 17.5f)
                curveTo(14.6642f, 17.5f, 15.0f, 17.8358f, 15.0f, 18.25f)
                close()
                moveTo(9.75f, 19.0f)
                curveTo(10.1642f, 19.0f, 10.5f, 18.6642f, 10.5f, 18.25f)
                curveTo(10.5f, 17.8358f, 10.1642f, 17.5f, 9.75f, 17.5f)
                curveTo(9.3358f, 17.5f, 9.0f, 17.8358f, 9.0f, 18.25f)
                curveTo(9.0f, 18.6642f, 9.3358f, 19.0f, 9.75f, 19.0f)
                close()
                moveTo(9.75f, 6.5f)
                curveTo(10.1642f, 6.5f, 10.5f, 6.1642f, 10.5f, 5.75f)
                curveTo(10.5f, 5.3358f, 10.1642f, 5.0f, 9.75f, 5.0f)
                curveTo(9.3358f, 5.0f, 9.0f, 5.3358f, 9.0f, 5.75f)
                curveTo(9.0f, 6.1642f, 9.3358f, 6.5f, 9.75f, 6.5f)
                close()
                moveTo(18.25f, 9.0f)
                curveTo(18.6642f, 9.0f, 19.0f, 9.3358f, 19.0f, 9.75f)
                curveTo(19.0f, 10.1642f, 18.6642f, 10.5f, 18.25f, 10.5f)
                curveTo(17.8358f, 10.5f, 17.5f, 10.1642f, 17.5f, 9.75f)
                curveTo(17.5f, 9.3358f, 17.8358f, 9.0f, 18.25f, 9.0f)
                close()
                moveTo(6.5f, 9.75f)
                curveTo(6.5f, 9.3358f, 6.1642f, 9.0f, 5.75f, 9.0f)
                curveTo(5.3358f, 9.0f, 5.0f, 9.3358f, 5.0f, 9.75f)
                curveTo(5.0f, 10.1642f, 5.3358f, 10.5f, 5.75f, 10.5f)
                curveTo(6.1642f, 10.5f, 6.5f, 10.1642f, 6.5f, 9.75f)
                close()
                moveTo(18.25f, 13.5f)
                curveTo(18.6642f, 13.5f, 19.0f, 13.8358f, 19.0f, 14.25f)
                curveTo(19.0f, 14.6642f, 18.6642f, 15.0f, 18.25f, 15.0f)
                curveTo(17.8358f, 15.0f, 17.5f, 14.6642f, 17.5f, 14.25f)
                curveTo(17.5f, 13.8358f, 17.8358f, 13.5f, 18.25f, 13.5f)
                close()
                moveTo(6.5f, 14.25f)
                curveTo(6.5f, 13.8358f, 6.1642f, 13.5f, 5.75f, 13.5f)
                curveTo(5.3358f, 13.5f, 5.0f, 13.8358f, 5.0f, 14.25f)
                curveTo(5.0f, 14.6642f, 5.3358f, 15.0f, 5.75f, 15.0f)
                curveTo(6.1642f, 15.0f, 6.5f, 14.6642f, 6.5f, 14.25f)
                close()
            }
        }
            .build()
        return _radialBlur!!
    }

private var _radialBlur: ImageVector? = null
