package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.UndoRightSquare: ImageVector
    get() {
        if (_undoRightSquare != null) {
            return _undoRightSquare!!
        }
        _undoRightSquare = Builder(name = "UndoRightSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7587f, 6.8727f)
                curveTo(15.4543f, 6.5918f, 14.9799f, 6.6108f, 14.6989f, 6.9151f)
                curveTo(14.4179f, 7.2195f, 14.4369f, 7.694f, 14.7413f, 7.9749f)
                lineTo(15.5818f, 8.7507f)
                lineTo(9.9242f, 8.7507f)
                curveTo(9.2721f, 8.7507f, 8.7279f, 8.7507f, 8.2867f, 8.7945f)
                curveTo(7.8252f, 8.8402f, 7.3962f, 8.9397f, 7.0069f, 9.1914f)
                curveTo(6.6801f, 9.4027f, 6.4019f, 9.6809f, 6.1906f, 10.0076f)
                curveTo(5.9389f, 10.397f, 5.8395f, 10.826f, 5.7937f, 11.2875f)
                curveTo(5.75f, 11.7286f, 5.75f, 12.2728f, 5.75f, 12.925f)
                verticalLineTo(12.9996f)
                curveTo(5.75f, 13.6518f, 5.75f, 14.196f, 5.7937f, 14.6371f)
                curveTo(5.8395f, 15.0986f, 5.9389f, 15.5276f, 6.1906f, 15.9169f)
                curveTo(6.4019f, 16.2437f, 6.6801f, 16.5219f, 7.0069f, 16.7332f)
                curveTo(7.3962f, 16.9849f, 7.8252f, 17.0843f, 8.2867f, 17.1301f)
                curveTo(8.7279f, 17.1739f, 9.2721f, 17.1738f, 9.9242f, 17.1738f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 17.1738f, 15.25f, 16.838f, 15.25f, 16.4238f)
                curveTo(15.25f, 16.0096f, 14.9142f, 15.6738f, 14.5f, 15.6738f)
                horizontalLineTo(9.9615f)
                curveTo(9.2624f, 15.6738f, 8.7931f, 15.673f, 8.4348f, 15.6374f)
                curveTo(8.0884f, 15.6031f, 7.9276f, 15.5423f, 7.8213f, 15.4735f)
                curveTo(7.6728f, 15.3775f, 7.5463f, 15.251f, 7.4503f, 15.1025f)
                curveTo(7.3815f, 14.9962f, 7.3207f, 14.8354f, 7.2864f, 14.4891f)
                curveTo(7.2509f, 14.1307f, 7.25f, 13.6614f, 7.25f, 12.9623f)
                curveTo(7.25f, 12.2632f, 7.2509f, 11.7938f, 7.2864f, 11.4355f)
                curveTo(7.3208f, 11.0892f, 7.3815f, 10.9284f, 7.4503f, 10.8221f)
                curveTo(7.5463f, 10.6735f, 7.6728f, 10.5471f, 7.8213f, 10.451f)
                curveTo(7.9276f, 10.3823f, 8.0884f, 10.3215f, 8.4348f, 10.2871f)
                curveTo(8.7931f, 10.2516f, 9.2624f, 10.2508f, 9.9615f, 10.2508f)
                horizontalLineTo(15.5818f)
                lineTo(14.7413f, 11.0266f)
                curveTo(14.4369f, 11.3075f, 14.4179f, 11.782f, 14.6989f, 12.0864f)
                curveTo(14.9799f, 12.3908f, 15.4543f, 12.4097f, 15.7587f, 12.1288f)
                lineTo(18.0087f, 10.0519f)
                curveTo(18.1625f, 9.9099f, 18.25f, 9.7101f, 18.25f, 9.5007f)
                curveTo(18.25f, 9.2914f, 18.1625f, 9.0916f, 18.0087f, 8.9496f)
                lineTo(15.7587f, 6.8727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                close()
                moveTo(3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4355f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                curveTo(21.2484f, 7.9136f, 21.25f, 9.6218f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                curveTo(2.75f, 9.6218f, 2.7516f, 7.9136f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                close()
            }
        }
        .build()
        return _undoRightSquare!!
    }

private var _undoRightSquare: ImageVector? = null
