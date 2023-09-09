package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.CaseRoundMinimalistic: ImageVector
    get() {
        if (_caseRoundMinimalistic != null) {
            return _caseRoundMinimalistic!!
        }
        _caseRoundMinimalistic = Builder(name = "CaseRoundMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.8777f, 4.2499f)
                curveTo(10.187f, 3.375f, 11.0214f, 2.75f, 11.9999f, 2.75f)
                curveTo(12.9784f, 2.75f, 13.8128f, 3.375f, 14.1221f, 4.2499f)
                curveTo(14.2601f, 4.6405f, 14.6886f, 4.8452f, 15.0791f, 4.7071f)
                curveTo(15.4697f, 4.5691f, 15.6744f, 4.1406f, 15.5363f, 3.7501f)
                curveTo(15.0219f, 2.2946f, 13.6339f, 1.25f, 11.9999f, 1.25f)
                curveTo(10.366f, 1.25f, 8.9779f, 2.2946f, 8.4635f, 3.7501f)
                curveTo(8.3254f, 4.1406f, 8.5301f, 4.5691f, 8.9207f, 4.7071f)
                curveTo(9.3112f, 4.8452f, 9.7397f, 4.6405f, 9.8777f, 4.2499f)
                close()
                moveTo(2.7472f, 8.091f)
                curveTo(2.6939f, 8.0563f, 2.6378f, 8.0293f, 2.5802f, 8.0097f)
                curveTo(2.7333f, 7.692f, 2.9269f, 7.4162f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(21.0731f, 7.4163f, 21.2667f, 7.6921f, 21.4199f, 8.0098f)
                curveTo(21.3624f, 8.0294f, 21.3064f, 8.0564f, 21.2531f, 8.091f)
                curveTo(19.1527f, 9.4563f, 17.8331f, 10.3102f, 16.7366f, 10.858f)
                curveTo(16.6702f, 10.5117f, 16.3657f, 10.25f, 16.0f, 10.25f)
                curveTo(15.5858f, 10.25f, 15.25f, 10.5858f, 15.25f, 11.0f)
                verticalLineTo(11.4581f)
                curveTo(13.1306f, 12.0976f, 10.8694f, 12.0976f, 8.75f, 11.458f)
                verticalLineTo(11.0f)
                curveTo(8.75f, 10.5858f, 8.4142f, 10.25f, 8.0f, 10.25f)
                curveTo(7.6344f, 10.25f, 7.3299f, 10.5116f, 7.2635f, 10.8578f)
                curveTo(6.167f, 10.31f, 4.8474f, 9.4561f, 2.7472f, 8.091f)
                close()
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 12.0495f, 2.0f, 10.6035f, 2.1621f, 9.4997f)
                curveTo(4.4388f, 10.9795f, 5.898f, 11.9233f, 7.25f, 12.5046f)
                verticalLineTo(13.0f)
                curveTo(7.25f, 13.4142f, 7.5858f, 13.75f, 8.0f, 13.75f)
                curveTo(8.4087f, 13.75f, 8.7411f, 13.4231f, 8.7498f, 13.0164f)
                curveTo(10.8801f, 13.5781f, 13.1199f, 13.5781f, 15.2502f, 13.0165f)
                curveTo(15.259f, 13.4231f, 15.5913f, 13.75f, 16.0f, 13.75f)
                curveTo(16.4142f, 13.75f, 16.75f, 13.4142f, 16.75f, 13.0f)
                verticalLineTo(12.5047f)
                curveTo(18.1021f, 11.9235f, 19.5613f, 10.9797f, 21.8379f, 9.4999f)
                curveTo(22.0f, 10.6036f, 22.0f, 12.0497f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _caseRoundMinimalistic!!
    }

private var _caseRoundMinimalistic: ImageVector? = null
