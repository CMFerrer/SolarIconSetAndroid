package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

public val FoodKitchenGroup.Wineglass: ImageVector
    get() {
        if (_wineglass != null) {
            return _wineglass!!
        }
        _wineglass = Builder(name = "Wineglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 4.8947f)
                curveTo(4.25f, 3.4341f, 5.4341f, 2.25f, 6.8947f, 2.25f)
                horizontalLineTo(17.1053f)
                curveTo(18.5659f, 2.25f, 19.75f, 3.4341f, 19.75f, 4.8947f)
                verticalLineTo(8.0f)
                curveTo(19.75f, 12.0272f, 16.6783f, 15.3369f, 12.75f, 15.7142f)
                verticalLineTo(20.2499f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.2499f, 16.5f, 20.5857f, 16.5f, 20.9999f)
                curveTo(16.5f, 21.4141f, 16.1642f, 21.7499f, 15.75f, 21.7499f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 21.7499f, 7.5f, 21.4141f, 7.5f, 20.9999f)
                curveTo(7.5f, 20.5857f, 7.8358f, 20.2499f, 8.25f, 20.2499f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.7142f)
                curveTo(7.3217f, 15.3369f, 4.25f, 12.0272f, 4.25f, 8.0f)
                verticalLineTo(4.8947f)
                close()
                moveTo(6.8947f, 3.75f)
                curveTo(6.2625f, 3.75f, 5.75f, 4.2625f, 5.75f, 4.8947f)
                verticalLineTo(8.0f)
                curveTo(5.75f, 8.0294f, 5.7502f, 8.0587f, 5.7506f, 8.088f)
                curveTo(5.9528f, 8.0095f, 6.2004f, 7.9173f, 6.4748f, 7.8232f)
                curveTo(7.1831f, 7.5805f, 8.1381f, 7.3016f, 8.954f, 7.2514f)
                curveTo(10.4226f, 7.1611f, 11.4822f, 7.8065f, 12.3428f, 8.3306f)
                curveTo(12.3586f, 8.3402f, 12.3743f, 8.3498f, 12.39f, 8.3594f)
                curveTo(13.2884f, 8.9062f, 13.9844f, 9.3111f, 14.954f, 9.2514f)
                curveTo(15.557f, 9.2143f, 16.352f, 8.9932f, 17.0389f, 8.7578f)
                curveTo(17.3731f, 8.6432f, 17.6655f, 8.5311f, 17.874f, 8.4476f)
                curveTo(17.9781f, 8.406f, 18.0608f, 8.3717f, 18.1168f, 8.3482f)
                curveTo(18.1447f, 8.3364f, 18.166f, 8.3273f, 18.1799f, 8.3213f)
                lineTo(18.1951f, 8.3147f)
                lineTo(18.1984f, 8.3133f)
                curveTo(18.2131f, 8.3069f, 18.2283f, 8.3007f, 18.2431f, 8.2953f)
                curveTo(18.2477f, 8.1975f, 18.25f, 8.099f, 18.25f, 8.0f)
                verticalLineTo(4.8947f)
                curveTo(18.25f, 4.2625f, 17.7375f, 3.75f, 17.1053f, 3.75f)
                horizontalLineTo(6.8947f)
                close()
                moveTo(17.9094f, 10.0404f)
                curveTo(17.0636f, 12.4903f, 14.7373f, 14.25f, 12.0f, 14.25f)
                curveTo(9.1082f, 14.25f, 6.6751f, 12.286f, 5.9618f, 9.6191f)
                curveTo(6.0079f, 9.6f, 6.063f, 9.5775f, 6.1259f, 9.5524f)
                curveTo(6.3345f, 9.4689f, 6.6269f, 9.3568f, 6.9611f, 9.2422f)
                curveTo(7.648f, 9.0068f, 8.443f, 8.7857f, 9.046f, 8.7486f)
                curveTo(10.0156f, 8.6889f, 10.7116f, 9.0938f, 11.61f, 9.6406f)
                curveTo(11.6257f, 9.6502f, 11.6414f, 9.6598f, 11.6572f, 9.6694f)
                curveTo(12.5178f, 10.1935f, 13.5774f, 10.8389f, 15.046f, 10.7486f)
                curveTo(15.8619f, 10.6984f, 16.8169f, 10.4195f, 17.5252f, 10.1768f)
                curveTo(17.6605f, 10.1304f, 17.7893f, 10.0845f, 17.9094f, 10.0404f)
                close()
            }
        }
        .build()
        return _wineglass!!
    }

private var _wineglass: ImageVector? = null
