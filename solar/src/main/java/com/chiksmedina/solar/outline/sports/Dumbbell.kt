package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) {
            return _dumbbell!!
        }
        _dumbbell = Builder(name = "Dumbbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.9748f, 6.25f)
                horizontalLineTo(5.0252f)
                curveTo(5.4697f, 6.25f, 5.8408f, 6.25f, 6.1454f, 6.2708f)
                curveTo(6.4625f, 6.2924f, 6.762f, 6.339f, 7.0524f, 6.4593f)
                curveTo(7.7262f, 6.7384f, 8.2616f, 7.2738f, 8.5407f, 7.9476f)
                curveTo(8.6159f, 8.1293f, 8.6548f, 8.3346f, 8.6789f, 8.5112f)
                curveTo(8.7045f, 8.6986f, 8.7201f, 8.9072f, 8.7301f, 9.1204f)
                curveTo(8.7395f, 9.3188f, 8.7444f, 9.5321f, 8.7471f, 9.75f)
                horizontalLineTo(15.2529f)
                curveTo(15.2556f, 9.5321f, 15.2605f, 9.3188f, 15.2699f, 9.1204f)
                curveTo(15.2799f, 8.9072f, 15.2955f, 8.6986f, 15.3211f, 8.5112f)
                curveTo(15.3452f, 8.3346f, 15.3841f, 8.1293f, 15.4593f, 7.9476f)
                curveTo(15.7384f, 7.2738f, 16.2738f, 6.7384f, 16.9476f, 6.4593f)
                curveTo(17.238f, 6.339f, 17.5375f, 6.2924f, 17.8546f, 6.2708f)
                curveTo(18.1592f, 6.25f, 18.5303f, 6.25f, 18.9747f, 6.25f)
                horizontalLineTo(19.0253f)
                curveTo(19.4697f, 6.25f, 19.8408f, 6.25f, 20.1454f, 6.2708f)
                curveTo(20.4625f, 6.2924f, 20.762f, 6.339f, 21.0524f, 6.4593f)
                curveTo(21.7262f, 6.7384f, 22.2616f, 7.2738f, 22.5407f, 7.9476f)
                curveTo(22.661f, 8.238f, 22.7076f, 8.5375f, 22.7292f, 8.8546f)
                curveTo(22.75f, 9.1593f, 22.75f, 9.5303f, 22.75f, 9.9747f)
                verticalLineTo(14.0253f)
                curveTo(22.75f, 14.4697f, 22.75f, 14.8408f, 22.7292f, 15.1454f)
                curveTo(22.7076f, 15.4625f, 22.661f, 15.762f, 22.5407f, 16.0524f)
                curveTo(22.2616f, 16.7262f, 21.7262f, 17.2616f, 21.0524f, 17.5407f)
                curveTo(20.762f, 17.661f, 20.4625f, 17.7076f, 20.1454f, 17.7292f)
                curveTo(19.8408f, 17.75f, 19.4697f, 17.75f, 19.0253f, 17.75f)
                horizontalLineTo(18.9747f)
                curveTo(18.5303f, 17.75f, 18.1592f, 17.75f, 17.8546f, 17.7292f)
                curveTo(17.5375f, 17.7076f, 17.238f, 17.661f, 16.9476f, 17.5407f)
                curveTo(16.2738f, 17.2616f, 15.7384f, 16.7262f, 15.4593f, 16.0524f)
                curveTo(15.3841f, 15.8706f, 15.3452f, 15.6654f, 15.3211f, 15.4889f)
                curveTo(15.2955f, 15.3014f, 15.2799f, 15.0928f, 15.2699f, 14.8796f)
                curveTo(15.2605f, 14.6812f, 15.2556f, 14.4679f, 15.2529f, 14.25f)
                horizontalLineTo(8.7471f)
                curveTo(8.7444f, 14.4679f, 8.7395f, 14.6812f, 8.7301f, 14.8796f)
                curveTo(8.7201f, 15.0928f, 8.7045f, 15.3014f, 8.6789f, 15.4889f)
                curveTo(8.6548f, 15.6654f, 8.6159f, 15.8706f, 8.5407f, 16.0524f)
                curveTo(8.2616f, 16.7262f, 7.7262f, 17.2616f, 7.0524f, 17.5407f)
                curveTo(6.762f, 17.661f, 6.4625f, 17.7076f, 6.1454f, 17.7292f)
                curveTo(5.8408f, 17.75f, 5.4697f, 17.75f, 5.0253f, 17.75f)
                horizontalLineTo(4.9747f)
                curveTo(4.5303f, 17.75f, 4.1592f, 17.75f, 3.8546f, 17.7292f)
                curveTo(3.5375f, 17.7076f, 3.238f, 17.661f, 2.9476f, 17.5407f)
                curveTo(2.2738f, 17.2616f, 1.7384f, 16.7262f, 1.4593f, 16.0524f)
                curveTo(1.3391f, 15.762f, 1.2924f, 15.4625f, 1.2708f, 15.1454f)
                curveTo(1.25f, 14.8408f, 1.25f, 14.4697f, 1.25f, 14.0253f)
                verticalLineTo(9.9747f)
                curveTo(1.25f, 9.5303f, 1.25f, 9.1593f, 1.2708f, 8.8546f)
                curveTo(1.2924f, 8.5375f, 1.3391f, 8.238f, 1.4593f, 7.9476f)
                curveTo(1.7384f, 7.2738f, 2.2738f, 6.7384f, 2.9476f, 6.4593f)
                curveTo(3.238f, 6.339f, 3.5375f, 6.2924f, 3.8546f, 6.2708f)
                curveTo(4.1592f, 6.25f, 4.5303f, 6.25f, 4.9748f, 6.25f)
                close()
                moveTo(3.9567f, 7.7673f)
                curveTo(3.716f, 7.7837f, 3.5988f, 7.8132f, 3.5217f, 7.8451f)
                curveTo(3.2154f, 7.972f, 2.972f, 8.2154f, 2.8451f, 8.5217f)
                curveTo(2.8132f, 8.5988f, 2.7837f, 8.716f, 2.7673f, 8.9567f)
                curveTo(2.7504f, 9.2042f, 2.75f, 9.5238f, 2.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 14.4762f, 2.7504f, 14.7958f, 2.7673f, 15.0433f)
                curveTo(2.7837f, 15.284f, 2.8132f, 15.4012f, 2.8451f, 15.4784f)
                curveTo(2.972f, 15.7846f, 3.2154f, 16.028f, 3.5217f, 16.1549f)
                curveTo(3.5988f, 16.1868f, 3.716f, 16.2163f, 3.9567f, 16.2327f)
                curveTo(4.2042f, 16.2496f, 4.5238f, 16.25f, 5.0f, 16.25f)
                curveTo(5.4762f, 16.25f, 5.7958f, 16.2496f, 6.0433f, 16.2327f)
                curveTo(6.284f, 16.2163f, 6.4012f, 16.1868f, 6.4784f, 16.1549f)
                curveTo(6.7846f, 16.028f, 7.028f, 15.7846f, 7.1549f, 15.4784f)
                curveTo(7.1546f, 15.4789f, 7.1549f, 15.4784f, 7.1549f, 15.4784f)
                curveTo(7.1548f, 15.4783f, 7.1595f, 15.4655f, 7.1671f, 15.4328f)
                curveTo(7.1753f, 15.3969f, 7.1841f, 15.3485f, 7.1927f, 15.2859f)
                curveTo(7.2099f, 15.1597f, 7.2228f, 14.9997f, 7.2318f, 14.809f)
                curveTo(7.2498f, 14.4263f, 7.25f, 13.9709f, 7.25f, 13.5f)
                curveTo(7.25f, 13.0858f, 7.5858f, 12.75f, 8.0f, 12.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 12.75f, 16.75f, 13.0858f, 16.75f, 13.5f)
                curveTo(16.75f, 13.9709f, 16.7502f, 14.4263f, 16.7682f, 14.809f)
                curveTo(16.7772f, 14.9997f, 16.7901f, 15.1597f, 16.8073f, 15.2859f)
                curveTo(16.8159f, 15.3485f, 16.8247f, 15.3969f, 16.8329f, 15.4328f)
                curveTo(16.8405f, 15.4655f, 16.8456f, 15.4792f, 16.8455f, 15.4792f)
                curveTo(16.8455f, 15.4792f, 16.8458f, 15.4798f, 16.8455f, 15.4792f)
                curveTo(16.9724f, 15.7855f, 17.2154f, 16.028f, 17.5216f, 16.1549f)
                curveTo(17.5988f, 16.1868f, 17.716f, 16.2163f, 17.9567f, 16.2327f)
                curveTo(18.2042f, 16.2496f, 18.5238f, 16.25f, 19.0f, 16.25f)
                curveTo(19.4762f, 16.25f, 19.7958f, 16.2496f, 20.0433f, 16.2327f)
                curveTo(20.284f, 16.2163f, 20.4012f, 16.1868f, 20.4784f, 16.1549f)
                curveTo(20.7846f, 16.028f, 21.028f, 15.7846f, 21.1549f, 15.4784f)
                curveTo(21.1868f, 15.4012f, 21.2163f, 15.284f, 21.2327f, 15.0433f)
                curveTo(21.2496f, 14.7958f, 21.25f, 14.4762f, 21.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.25f, 9.5238f, 21.2496f, 9.2042f, 21.2327f, 8.9567f)
                curveTo(21.2163f, 8.716f, 21.1868f, 8.5988f, 21.1549f, 8.5217f)
                curveTo(21.028f, 8.2154f, 20.7846f, 7.972f, 20.4784f, 7.8451f)
                curveTo(20.4012f, 7.8132f, 20.284f, 7.7837f, 20.0433f, 7.7673f)
                curveTo(19.7958f, 7.7504f, 19.4762f, 7.75f, 19.0f, 7.75f)
                curveTo(18.5238f, 7.75f, 18.2042f, 7.7504f, 17.9567f, 7.7673f)
                curveTo(17.716f, 7.7837f, 17.5988f, 7.8132f, 17.5216f, 7.8451f)
                curveTo(17.2154f, 7.972f, 16.972f, 8.2154f, 16.8452f, 8.5217f)
                curveTo(16.8454f, 8.5211f, 16.8451f, 8.5216f, 16.8452f, 8.5217f)
                curveTo(16.8452f, 8.5217f, 16.8405f, 8.5345f, 16.8329f, 8.5672f)
                curveTo(16.8247f, 8.6031f, 16.8159f, 8.6515f, 16.8073f, 8.7141f)
                curveTo(16.7901f, 8.8403f, 16.7772f, 9.0003f, 16.7682f, 9.191f)
                curveTo(16.7502f, 9.5737f, 16.75f, 10.0291f, 16.75f, 10.5f)
                curveTo(16.75f, 10.9142f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                curveTo(7.25f, 10.0291f, 7.2498f, 9.5737f, 7.2318f, 9.191f)
                curveTo(7.2228f, 9.0003f, 7.2099f, 8.8403f, 7.1927f, 8.7141f)
                curveTo(7.1841f, 8.6515f, 7.1753f, 8.6031f, 7.1671f, 8.5672f)
                curveTo(7.1595f, 8.5345f, 7.1544f, 8.5208f, 7.1545f, 8.5208f)
                curveTo(7.1545f, 8.5208f, 7.1543f, 8.5202f, 7.1545f, 8.5208f)
                curveTo(7.0276f, 8.2145f, 6.7846f, 7.972f, 6.4784f, 7.8451f)
                curveTo(6.4012f, 7.8132f, 6.284f, 7.7837f, 6.0433f, 7.7673f)
                curveTo(5.7958f, 7.7504f, 5.4762f, 7.75f, 5.0f, 7.75f)
                curveTo(4.5238f, 7.75f, 4.2042f, 7.7504f, 3.9567f, 7.7673f)
                close()
            }
        }
        .build()
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
